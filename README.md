# How to use Git and Github with Intellij

1. **git**과 **github**

2. **Local git** 설치하기(window 10 기준)

3. **Gitbhub** 저장소에 대해 **Collaborator** 권한 얻기

4. **Remote repository** (github 저장소)에서 **Local git**으로 **repository**를 clone 해오기

5. **Intellij**에서 프로젝트 수정사항 **commit**, **push**하기

6. **Jenkins** 빌드 결과 확인하기

7. **Test case** 작성방법


## 1. **Git**과 **Github**

The file explorer is accessible using the button in left corner of the navigation bar. You can create a new file by clicking the **New file** button in the file explorer. You can also create folders by clicking the **New folder** button.



##  2. **Local** git 설치하기(window 10 기준)

[git install](https://git-scm.com/downloads)
위 링크를 클릭해 자신의 OS에 맞는 버전을 설치해줍니다. 여기서는 window 10을 기준으로 진행하겠습니다.

설치 중 나오는 설정은 기본적으로 체크된 대로 진행하시면 됩니다.

![gitbashopen](./readme_image/gitbashopen.png)
바탕화면에서 git bash여는 그림

설치가 완료되면 바탕화면의 아무곳에나 대고 오른쪽 버튼을 클릭해 git bash를 열어줍니다.

![gitconfig](./readme_image/gitconfig.JPG)

위와 같은 명령어를 통해 local git과 연동할 github의 이메일과 username을 등록해줍니다.



##  3. **Gitbhub** 저장소에 대해 **Collaborator** 권한 얻기

다음으로 원본 repository에 대한 commit과 push 권한을 얻기위해 원본 repository의 collaborator가 되는 과정입니다.
해당 권한이 없으면 원본 코드에 수정사항을 반영하기 위해 commit과 push를 진행하고, repository의 소유자에게 pull request를 요청해 승인을 받아야 해당 코드가 반영되게 됩니다.
이번 프로젝트에서는 이 과정을 생략하기 위해 collaborator 권한을 얻어 코드 수정자가 직접 원본 코드에 push하도록 하겠습니다.

Github repository 소유자에게 collaborator invitation을 요청합니다. 소유자가 invitation을 보내면, github에 등록된 이메일로 invitation 메일이 오게됩니다.

![invitation](./readme_image/invitation.JPG)
![accept_invitation](./readme_image/accept_invitation.JPG)

이메일에서 verify를 누르고 다음 과정을 거치게 되면 해당 repository의 collaborator로서 등록이 되게됩니다.

##  4. **Remote repository** (github 저장소)에서 **Local git**으로 **repository**를 clone 해오기

이전 과정에서 repository의 동료 권한을 얻게되면 나의 local desktop 환경으로 repository 프로젝트를 복사해서 가져올 수 있게됩니다. 

![gitbashopen](./readme_image/gitbashopen.png)
바탕화면에서 깃배쉬를 여는 그림

여기서는 바탕화면에 git_test라는 폴더에 local git 저장소를 만들어 저장해보겠습니다.

![cloning_repo](./readme_image/cloning_repo.JPG)
배쉬 명령어로 클론 해오는 그림

git clone <클론하려는 저장소 주소> <복사하려는경로>
위와 같은 명령어를 통해 바탕화면(Desktop) 경로에 git_test 폴더를 생성함과 동시에 local git 저장소로 만들었습니다.

![cloned_folder](./readme_image/cloned_folder.JPG)
git_test 폴더 내부 그림

위와 같이 .git 폴더와 github repository 프로젝트 파일들이 생성되었다면 성공적으로 clone된 것입니다.

##  5. **Intellij**에서 프로젝트 수정사항 **commit**, **push**하기

![open_project](./readme_image/open_project.JPG)
먼저 intellij에서 생성한 clone해온 프로젝트를 열어 줍니다.

![imported_project](./readme_image/imported_project.JPG)

위 프로젝트에서 src/main 과 src/test에 각각 소스코드와 그 소스코드를 테스트할 테스트코드를 하면됩니다.

![intellij_git](./readme_image/intellij_git.JPG)

intellij에서 작성한 코드 수정사항을 반영하기 위해서는 intellij에 
git.exe 파일의 위치를 인식 시켜줘야 합니다.
intellij 상단 메뉴에서 File - settings - version control - git에 들어가면 자동으로 git.exe의 위치를 찾아줍니다. 여기서 test 버튼을 클릭해 git version이 제대로 뜨는지 확인해줍니다.

![intellij_github](./readme_image/intellij_github.JPG)

같은 위치에서 version control - github에서 우측 상단 +를 클릭해 자신의 github account를 입력해줍니다. login에는 이메일 주소 or username을 입력하고 비밀번호를 입력해준 뒤 로그인 해줍니다.

프로젝트에 수정사항(코드수정 등)이 발생했을때 이를 commit 하게되면 이것이 바로 github의 repository(remote repository)에 반영되는 것이 아닙니다. 이는 local repository에 반영되고 이를 remote repo에 push 해줘야 원본 코드에 반영되 되게됩니다.

![commit](./readme_image/commit.JPG)
위 그림에서 초록색 v표시를 누릅니다.

![commit2](./readme_image/commit2.JPG)
수정사항이 생긴 프로젝트 파일이 목록에 나타나게 되고 commit하고 싶은 파일을 선택해줍니다. commit에 대한 설명을 commit message에 남겨주고, commit 버튼을 눌러줍니다.

![commit3](./readme_image/commit3.JPG)
commit을 확인하는 창이 나타나는데 error 없다면 commit을 진행합니다.

![commit4](./readme_image/commit4.JPG)
위와 같은 창이 나타나면 local repo에 commit이 완료된것입니다.

이제 remote repo에 반영하기 위해 push를 진행해보겠습니다.

![push](./readme_image/push.png)
상단 메뉴에서 VCS - Git - push를 차례로 선택합니다.
push할 저장소를 추가하기 위해 Define remote를 선택합니다.

![push2](./readme_image/push2.JPG)
Name에 remote repository의 이름, url에 그 주소를 입력합니다.

![push3](./readme_image/push3.JPG)
저장소가 추가되면 다시 한번 origin을 눌러 해당 저장소로 바꿔줍니다. 왼쪽 목록에 원본 저장소의 commit history가 나타나는 것을 볼 수 있습니다. 이제 push를 눌러줍니다.

![push4](./readme_image/push4.JPG)
앞서 등록해둔 github account로 로그인 해줍니다.
>이때 선택하는 account는 collaborator 권한을 가지고 있어야합니다.

![push5](./readme_image/push5.JPG)
우측 하단에 위와 같은 메세지가 나온면 remote repo에 수정 사항이 반영된 것입니다.


##  6. **Jenkins** 빌드 결과 확인하기

All your files and folders are presented as a tree in the file explorer. You can switch from one to another by clicking a file in the tree.

##  7. **Test case** 작성방법

All your files and folders are presented as a tree in the file explorer. You can switch from one to another by clicking a file in the tree.






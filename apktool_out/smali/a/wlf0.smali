.class public abstract La/wlf0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/app/Activity;La/kkz;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of v0, p0, La/clz;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, La/clz;

    .line 12
    .line 13
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    instance-of v0, p0, La/glz;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/glz;->d(La/kkz;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public static b(Landroid/app/Activity;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1d

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    sget-object v0, La/ylf0$a;->Companion:La/xlf0;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, La/ylf0$a;

    .line 16
    .line 17
    invoke-direct {v0}, La/ylf0$a;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v0}, La/xl50;->o(Landroid/app/Activity;La/ylf0$a;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v0, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-instance v2, La/ylf0;

    .line 40
    .line 41
    invoke-direct {v2}, La/ylf0;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void
.end method

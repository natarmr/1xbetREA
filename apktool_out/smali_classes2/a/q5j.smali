.class public final La/q5j;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final a(Landroidx/fragment/app/e;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget p0, La/q1j;->n2:I

    .line 5
    .line 6
    const-string p0, "DailyTaskOnboardingBottomSheetDialog"

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, La/q1j;

    .line 15
    .line 16
    invoke-direct {v0}, La/q1j;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, p1, p0}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

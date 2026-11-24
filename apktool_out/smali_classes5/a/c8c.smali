.class public final La/c8c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/us00;


# direct methods
.method public constructor <init>(La/us00;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/c8c;->a:La/us00;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    iget-object p0, p0, La/c8c;->a:La/us00;

    .line 6
    .line 7
    if-lt v0, v1, :cond_1

    .line 8
    .line 9
    const-string v0, "android.permission.POST_NOTIFICATIONS"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_1
    new-instance v0, La/o760;

    .line 22
    .line 23
    invoke-direct {v0, p0}, La/o760;-><init>(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, v0, La/o760;->b:Landroid/app/NotificationManager;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/app/NotificationManager;->areNotificationsEnabled()Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

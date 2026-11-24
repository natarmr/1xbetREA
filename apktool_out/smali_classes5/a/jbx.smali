.class public final La/jbx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/nv20;

.field public final b:La/rrc;


# direct methods
.method public constructor <init>(La/nv20;La/rrc;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jbx;->a:La/nv20;

    .line 5
    .line 6
    iput-object p2, p0, La/jbx;->b:La/rrc;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, La/jbx;->a:La/nv20;

    .line 2
    .line 3
    iget-object v0, v0, La/nv20;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/of6;

    .line 6
    .line 7
    iget-object v1, v0, La/of6;->a:La/q7d0;

    .line 8
    .line 9
    const-string v2, "bannerFeedManuallyChanged"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-static {v1, v2, v3}, La/axq;->z(La/q7d0;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object p0, p0, La/jbx;->b:La/rrc;

    .line 20
    .line 21
    iget-object v1, p0, La/rrc;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, La/tgk;

    .line 24
    .line 25
    iget-object v1, v1, La/tgk;->i:La/n0o0;

    .line 26
    .line 27
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, La/rrc;->F()Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_1

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    :cond_1
    iget-object p0, v0, La/of6;->a:La/q7d0;

    .line 47
    .line 48
    const-string v1, "SHOW_BANNER_FEED_ENABLE"

    .line 49
    .line 50
    invoke-virtual {p0, v1, v3}, La/q7d0;->d(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    iget-object p0, v0, La/of6;->a:La/q7d0;

    .line 54
    .line 55
    const-string v0, "showBannerFeed"

    .line 56
    .line 57
    invoke-virtual {p0, v0, v3}, La/q7d0;->d(Ljava/lang/String;Z)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

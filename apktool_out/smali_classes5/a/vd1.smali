.class public final La/vd1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/kt2;


# direct methods
.method public constructor <init>(La/kt2;B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/vd1;->a:La/kt2;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/vd1;->a:La/kt2;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/vd1;->a:La/kt2;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/vd1;->a:La/kt2;

    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, La/vd1;->a:La/kt2;

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, La/vd1;->a:La/kt2;

    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, La/vd1;->a:La/kt2;

    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string p1, "on"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string p1, "off"

    .line 7
    .line 8
    :goto_0
    const-string v0, "action"

    .line 9
    .line 10
    iget-object p0, p0, La/vd1;->a:La/kt2;

    .line 11
    .line 12
    const-string v1, "email_auth"

    .line 13
    .line 14
    invoke-static {p1, v0, p0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    const-string v0, "screen"

    .line 2
    .line 3
    const-string v1, "acc_safety"

    .line 4
    .line 5
    iget-object p0, p0, La/vd1;->a:La/kt2;

    .line 6
    .line 7
    const-string v2, "acc_add_phone_call"

    .line 8
    .line 9
    invoke-static {v0, v1, p0, v2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public c()V
    .locals 4

    .line 1
    new-instance v0, Lkotlin/Pair;

    .line 2
    .line 3
    const-string v1, "screen"

    .line 4
    .line 5
    const-string v2, "acc_safety"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lkotlin/Pair;

    .line 11
    .line 12
    const-string v2, "element"

    .line 13
    .line 14
    const-string v3, "allert_add_phone"

    .line 15
    .line 16
    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    filled-new-array {v0, v1}, [Lkotlin/Pair;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object p0, p0, La/vd1;->a:La/kt2;

    .line 28
    .line 29
    const-string v1, "acc_add_phone_call"

    .line 30
    .line 31
    invoke-interface {p0, v1, v0}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "promocode_activate_opened"

    .line 2
    .line 3
    const-string v1, "screen"

    .line 4
    .line 5
    iget-object p0, p0, La/vd1;->a:La/kt2;

    .line 6
    .line 7
    invoke-static {v1, p1, p0, v0}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "promo_games_presents_call"

    .line 2
    .line 3
    const-string v1, "screen"

    .line 4
    .line 5
    iget-object p0, p0, La/vd1;->a:La/kt2;

    .line 6
    .line 7
    invoke-static {v1, p1, p0, v0}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "acc_security_set_menu"

    .line 2
    .line 3
    const-string v1, "point"

    .line 4
    .line 5
    iget-object p0, p0, La/vd1;->a:La/kt2;

    .line 6
    .line 7
    invoke-static {v1, p1, p0, v0}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public g(I)V
    .locals 2

    .line 1
    const/4 v0, 0x7

    .line 2
    if-eq p1, v0, :cond_3

    .line 3
    .line 4
    const/16 v0, 0x18

    .line 5
    .line 6
    if-eq p1, v0, :cond_2

    .line 7
    .line 8
    const/16 v0, 0x1e

    .line 9
    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/16 v0, 0x5a

    .line 13
    .line 14
    if-eq p1, v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p1, "3"

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const-string p1, "1"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    const-string p1, "24"

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    const-string p1, "7"

    .line 27
    .line 28
    :goto_0
    const-string v0, "acc_responsible_gambling_limit_done"

    .line 29
    .line 30
    const-string v1, "point"

    .line 31
    .line 32
    iget-object p0, p0, La/vd1;->a:La/kt2;

    .line 33
    .line 34
    invoke-static {v1, p1, p0, v0}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

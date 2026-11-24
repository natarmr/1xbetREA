.class public final La/ag3;
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
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/ag3;->a:La/kt2;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/ag3;->a:La/kt2;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/ag3;->a:La/kt2;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/ag3;->a:La/kt2;

    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, La/ag3;->a:La/kt2;

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, La/ag3;->a:La/kt2;

    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, La/ag3;->a:La/kt2;

    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, La/ag3;->a:La/kt2;

    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(La/kt2;La/knf0;La/peg0;La/gst0;)V
    .locals 0

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, La/ag3;->a:La/kt2;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkotlin/Pair;

    .line 5
    .line 6
    const-string v1, "point"

    .line 7
    .line 8
    const-string v2, "top_champ"

    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lkotlin/Pair;

    .line 14
    .line 15
    const-string v2, "option"

    .line 16
    .line 17
    invoke-direct {v1, v2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    new-instance p1, Lkotlin/Pair;

    .line 21
    .line 22
    const-string v2, "championship_id"

    .line 23
    .line 24
    invoke-direct {p1, v2, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    filled-new-array {v0, v1, p1}, [Lkotlin/Pair;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object p0, p0, La/ag3;->a:La/kt2;

    .line 36
    .line 37
    const-string p2, "main_menu_call"

    .line 38
    .line 39
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/Pair;

    .line 2
    .line 3
    const-string v1, "point"

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance p2, Lkotlin/Pair;

    .line 9
    .line 10
    const-string v1, "option"

    .line 11
    .line 12
    invoke-direct {p2, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    filled-new-array {v0, p2}, [Lkotlin/Pair;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object p0, p0, La/ag3;->a:La/kt2;

    .line 24
    .line 25
    const-string p2, "main_menu_call"

    .line 26
    .line 27
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public c()V
    .locals 3

    .line 1
    const-string v0, "menu_other"

    .line 2
    .line 3
    const-string v1, "screen"

    .line 4
    .line 5
    iget-object p0, p0, La/ag3;->a:La/kt2;

    .line 6
    .line 7
    const-string v2, "acc_security_set_call"

    .line 8
    .line 9
    invoke-static {v0, v1, p0, v2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public d(La/ym4;I)V
    .locals 2

    .line 1
    iget-object p1, p1, La/ym4;->a:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v0, Lkotlin/Pair;

    .line 4
    .line 5
    const-string v1, "option"

    .line 6
    .line 7
    invoke-direct {v0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance p2, Lkotlin/Pair;

    .line 15
    .line 16
    const-string v1, "error_code"

    .line 17
    .line 18
    invoke-direct {p2, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    filled-new-array {v0, p2}, [Lkotlin/Pair;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, La/xp20;->h([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object p0, p0, La/ag3;->a:La/kt2;

    .line 30
    .line 31
    const-string p2, "add_phone_input_error"

    .line 32
    .line 33
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

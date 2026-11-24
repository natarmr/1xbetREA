.class public final La/ikc0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/ikc0;",
        "La/yx5;",
        "<init>",
        "()V",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic O1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/iki;

.field public final M1:La/kiu0;

.field public final N1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/ikc0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/bonus_games/impl/databinding/PromoGamesInfoFragmentBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/ikc0;->O1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d053b

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/i9o0;->a:La/i9o0;

    .line 8
    .line 9
    iput-object v0, p0, La/ikc0;->K1:La/i9o0;

    .line 10
    .line 11
    new-instance v0, La/ssa0;

    .line 12
    .line 13
    const/16 v1, 0x1a

    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, La/ssa0;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/g8b0;

    .line 19
    .line 20
    const/16 v2, 0x13

    .line 21
    .line 22
    invoke-direct {v1, p0, v2}, La/g8b0;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    sget-object v2, La/wez;->b:La/wez;

    .line 26
    .line 27
    new-instance v3, La/g8b0;

    .line 28
    .line 29
    const/16 v4, 0x14

    .line 30
    .line 31
    invoke-direct {v3, v1, v4}, La/g8b0;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-class v2, La/nkc0;

    .line 39
    .line 40
    sget-object v3, La/sre0;->a:La/tre0;

    .line 41
    .line 42
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v3, La/x6b0;

    .line 47
    .line 48
    const/16 v4, 0x16

    .line 49
    .line 50
    invoke-direct {v3, v1, v4}, La/x6b0;-><init>(La/a8z;B)V

    .line 51
    .line 52
    .line 53
    new-instance v4, La/x6b0;

    .line 54
    .line 55
    const/16 v5, 0x17

    .line 56
    .line 57
    invoke-direct {v4, v1, v5}, La/x6b0;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/ikc0;->M1:La/kiu0;

    .line 65
    .line 66
    sget-object v0, La/hkc0;->a:La/hkc0;

    .line 67
    .line 68
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, La/ikc0;->N1:La/s0r;

    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    instance-of v1, v0, La/kjc0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, La/kjc0;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, La/kjc0;->M1:La/kki;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-byte v1, v0, La/kki;->a:B

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    :pswitch_0
    iget-object v0, v0, La/kki;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, La/n5d0;

    .line 25
    .line 26
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, La/iki;

    .line 31
    .line 32
    iput-object v0, p0, La/ikc0;->L1:La/iki;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :pswitch_1
    iget-object v0, v0, La/kki;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, La/n5d0;

    .line 38
    .line 39
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, La/iki;

    .line 44
    .line 45
    iput-object v0, p0, La/ikc0;->L1:La/iki;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :pswitch_2
    iget-object v0, v0, La/kki;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, La/n5d0;

    .line 51
    .line 52
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, La/iki;

    .line 57
    .line 58
    iput-object v0, p0, La/ikc0;->L1:La/iki;

    .line 59
    .line 60
    :cond_1
    :goto_1
    return-void

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final D0()V
    .locals 7

    .line 1
    iget-object v0, p0, La/ikc0;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/nkc0;

    .line 8
    .line 9
    iget-object v2, v0, La/nkc0;->b:La/p7m0;

    .line 10
    .line 11
    new-instance v4, La/s9c0;

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v0, 0x3

    .line 15
    invoke-direct {v4, p0, v5, v0}, La/s9c0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 16
    .line 17
    .line 18
    sget-object v1, La/lkz;->a:La/lkz;

    .line 19
    .line 20
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    new-instance v1, La/p8c0;

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    invoke-direct/range {v1 .. v6}, La/p8c0;-><init>(La/gmq;La/clz;La/s9c0;La/yje;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v5, v5, v1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final G0()La/jkc0;
    .locals 2

    .line 1
    sget-object v0, La/ikc0;->O1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ikc0;->N1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/jkc0;

    .line 16
    .line 17
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ikc0;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method

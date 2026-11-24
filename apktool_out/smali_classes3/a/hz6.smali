.class public final La/hz6;
.super La/nw5;
.source "SourceFile"

# interfaces
.implements La/i620;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/nw5<",
        "La/vik;",
        ">;",
        "La/i620;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "La/hz6;",
        "La/nw5;",
        "La/vik;",
        "La/i620;",
        "<init>",
        "()V",
        "a/cl5",
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
.field public static final p2:La/cl5;

.field public static final synthetic q2:[La/iiy;


# instance fields
.field public final e2:La/o900;

.field public final f2:La/khf0;

.field public final g2:La/phf0;

.field public final h2:La/zz2;

.field public i2:Landroid/view/ViewPropertyAnimator;

.field public j2:La/wjk;

.field public k2:La/ii;

.field public l2:La/jki;

.field public final m2:La/kiu0;

.field public final n2:La/n0o0;

.field public final o2:La/nae0;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/hz6;

    .line 4
    .line 5
    const-string v2, "fakeViewPosition"

    .line 6
    .line 7
    const-string v3, "getFakeViewPosition()Landroid/graphics/Rect;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "requestKey"

    .line 16
    .line 17
    const-string v5, "getRequestKey()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "highlighted"

    .line 25
    .line 26
    const-string v6, "getHighlighted()I"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/j0d0;

    .line 32
    .line 33
    const-string v6, "binding"

    .line 34
    .line 35
    const-string v7, "getBinding()Lorg/xplatform/bonus_games/impl/databinding/DialogGameBetShopBinding;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    new-array v1, v1, [La/iiy;

    .line 42
    .line 43
    aput-object v0, v1, v4

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object v2, v1, v0

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    aput-object v3, v1, v0

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    aput-object v5, v1, v0

    .line 53
    .line 54
    sput-object v1, La/hz6;->q2:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/cl5;

    .line 57
    .line 58
    const/4 v1, 0x5

    .line 59
    invoke-direct {v0, v1}, La/cl5;-><init>(B)V

    .line 60
    .line 61
    .line 62
    sput-object v0, La/hz6;->p2:La/cl5;

    .line 63
    .line 64
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/nw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/o900;

    .line 5
    .line 6
    invoke-direct {v0}, La/efk0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/hz6;->e2:La/o900;

    .line 10
    .line 11
    new-instance v0, La/khf0;

    .line 12
    .line 13
    const-string v1, "KEY_FAKE_VIEW_POSITION"

    .line 14
    .line 15
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/hz6;->f2:La/khf0;

    .line 19
    .line 20
    new-instance v0, La/phf0;

    .line 21
    .line 22
    const-string v1, "BONUS_BOUGHT_REQUEST_KEY"

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, La/hz6;->g2:La/phf0;

    .line 28
    .line 29
    new-instance v0, La/zz2;

    .line 30
    .line 31
    const-string v1, "HIGHLITED_DOT_REQUEST_KEY"

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {v0, v1, v2}, La/zz2;-><init>(Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, La/hz6;->h2:La/zz2;

    .line 38
    .line 39
    new-instance v0, La/dz6;

    .line 40
    .line 41
    invoke-direct {v0, p0, v2}, La/dz6;-><init>(La/hz6;B)V

    .line 42
    .line 43
    .line 44
    new-instance v1, La/p46;

    .line 45
    .line 46
    const/16 v2, 0xe

    .line 47
    .line 48
    invoke-direct {v1, p0, v2}, La/p46;-><init>(Ljava/lang/Object;B)V

    .line 49
    .line 50
    .line 51
    sget-object v2, La/wez;->b:La/wez;

    .line 52
    .line 53
    new-instance v3, La/p46;

    .line 54
    .line 55
    const/16 v4, 0xf

    .line 56
    .line 57
    invoke-direct {v3, v1, v4}, La/p46;-><init>(Ljava/lang/Object;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const-class v2, La/b07;

    .line 65
    .line 66
    sget-object v3, La/sre0;->a:La/tre0;

    .line 67
    .line 68
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    new-instance v3, La/rt6;

    .line 73
    .line 74
    const/4 v4, 0x2

    .line 75
    invoke-direct {v3, v1, v4}, La/rt6;-><init>(La/a8z;B)V

    .line 76
    .line 77
    .line 78
    new-instance v4, La/rt6;

    .line 79
    .line 80
    const/4 v5, 0x3

    .line 81
    invoke-direct {v4, v1, v5}, La/rt6;-><init>(La/a8z;B)V

    .line 82
    .line 83
    .line 84
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iput-object v0, p0, La/hz6;->m2:La/kiu0;

    .line 89
    .line 90
    new-instance v0, La/dz6;

    .line 91
    .line 92
    const/4 v1, 0x1

    .line 93
    invoke-direct {v0, p0, v1}, La/dz6;-><init>(La/hz6;B)V

    .line 94
    .line 95
    .line 96
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iput-object v0, p0, La/hz6;->n2:La/n0o0;

    .line 101
    .line 102
    sget-object v0, La/fz6;->a:La/fz6;

    .line 103
    .line 104
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iput-object v0, p0, La/hz6;->o2:La/nae0;

    .line 109
    .line 110
    return-void
.end method


# virtual methods
.method public final I0()I
    .locals 0

    .line 1
    const p0, 0x7f040ae5

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final bridge synthetic L0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/hz6;->T0()La/vik;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final P0()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, v1

    .line 10
    :goto_0
    instance-of v2, v0, La/kjc0;

    .line 11
    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    move-object v1, v0

    .line 15
    check-cast v1, La/kjc0;

    .line 16
    .line 17
    :cond_1
    if-eqz v1, :cond_2

    .line 18
    .line 19
    iget-object v0, v1, La/kjc0;->M1:La/kki;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-byte v1, v0, La/kki;->a:B

    .line 24
    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    :pswitch_0
    iget-object v1, v0, La/kki;->e:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, La/iyi;

    .line 31
    .line 32
    iget-object v1, v1, La/iyi;->a:La/g8i;

    .line 33
    .line 34
    invoke-virtual {v1}, La/g8i;->j()La/ii;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iput-object v1, p0, La/hz6;->k2:La/ii;

    .line 39
    .line 40
    iget-object v0, v0, La/kki;->f:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, La/n5d0;

    .line 43
    .line 44
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, La/jki;

    .line 49
    .line 50
    iput-object v0, p0, La/hz6;->l2:La/jki;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :pswitch_1
    iget-object v1, v0, La/kki;->e:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, La/nli;

    .line 56
    .line 57
    iget-object v1, v1, La/nli;->a:La/g8i;

    .line 58
    .line 59
    invoke-virtual {v1}, La/g8i;->j()La/ii;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iput-object v1, p0, La/hz6;->k2:La/ii;

    .line 64
    .line 65
    iget-object v0, v0, La/kki;->f:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, La/n5d0;

    .line 68
    .line 69
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, La/jki;

    .line 74
    .line 75
    iput-object v0, p0, La/hz6;->l2:La/jki;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :pswitch_2
    iget-object v1, v0, La/kki;->e:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, La/fki;

    .line 81
    .line 82
    iget-object v1, v1, La/fki;->a:La/g8i;

    .line 83
    .line 84
    invoke-virtual {v1}, La/g8i;->j()La/ii;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iput-object v1, p0, La/hz6;->k2:La/ii;

    .line 89
    .line 90
    iget-object v0, v0, La/kki;->f:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, La/n5d0;

    .line 93
    .line 94
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, La/jki;

    .line 99
    .line 100
    iput-object v0, p0, La/hz6;->l2:La/jki;

    .line 101
    .line 102
    :cond_2
    :goto_1
    return-void

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final Q0()I
    .locals 0

    .line 1
    const p0, 0x7f0a0c51

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final T0()La/vik;
    .locals 2

    .line 1
    sget-object v0, La/hz6;->q2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/hz6;->o2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/vik;

    .line 16
    .line 17
    return-object p0
.end method

.method public final U0()La/b07;
    .locals 0

    .line 1
    iget-object p0, p0, La/hz6;->m2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/b07;

    .line 8
    .line 9
    return-object p0
.end method

.method public final V(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/wjk;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, La/wjk;

    .line 9
    .line 10
    iput-object p1, p0, La/hz6;->j2:La/wjk;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final V0(La/k390;I)V
    .locals 8

    .line 1
    sget-object v0, La/hz6;->q2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/hz6;->g2:La/phf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-wide v1, p1, La/k390;->a:J

    .line 13
    .line 14
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, Lkotlin/Pair;

    .line 19
    .line 20
    const-string v3, "BONUS_BOUGHT_RESULT_KEY_USER_ID"

    .line 21
    .line 22
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-wide v3, p1, La/k390;->b:J

    .line 26
    .line 27
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    new-instance v3, Lkotlin/Pair;

    .line 32
    .line 33
    const-string v4, "BONUS_BOUGHT_RESULT_KEY_ACCOUNT_ID"

    .line 34
    .line 35
    invoke-direct {v3, v4, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-wide v4, p1, La/k390;->c:D

    .line 39
    .line 40
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    new-instance v4, Lkotlin/Pair;

    .line 45
    .line 46
    const-string v5, "BONUS_BOUGHT_RESULT_KEY_ACCOUNT_BALANCE"

    .line 47
    .line 48
    invoke-direct {v4, v5, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget v1, p1, La/k390;->d:I

    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    new-instance v5, Lkotlin/Pair;

    .line 58
    .line 59
    const-string v6, "BONUS_BOUGHT_RESULT_KEY_BONUS_BALANCE"

    .line 60
    .line 61
    invoke-direct {v5, v6, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget p1, p1, La/k390;->e:I

    .line 65
    .line 66
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance v6, Lkotlin/Pair;

    .line 71
    .line 72
    const-string v1, "BONUS_BOUGHT_RESULT_KEY_ROTATION_COUNT"

    .line 73
    .line 74
    invoke-direct {v6, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    new-instance v7, Lkotlin/Pair;

    .line 82
    .line 83
    const-string p2, "BONUS_BOUGHT_RESULT_KEY_BOUGHT_COUNT"

    .line 84
    .line 85
    invoke-direct {v7, p2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    filled-new-array/range {v2 .. v7}, [Lkotlin/Pair;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {p1, p0, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public final W0(Landroid/view/View;ILkotlin/jvm/functions/Function0;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/sik;->D0()Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroid/graphics/Rect;

    .line 6
    .line 7
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v2, Landroid/graphics/Rect;

    .line 11
    .line 12
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/hz6;->T0()La/vik;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v3, v3, La/vik;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 20
    .line 21
    invoke-virtual {v3, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 25
    .line 26
    .line 27
    iget p1, v2, Landroid/graphics/Rect;->left:I

    .line 28
    .line 29
    neg-int p1, p1

    .line 30
    iget v3, v2, Landroid/graphics/Rect;->top:I

    .line 31
    .line 32
    neg-int v3, v3

    .line 33
    invoke-virtual {v1, p1, v3}, Landroid/graphics/Rect;->offset(II)V

    .line 34
    .line 35
    .line 36
    new-instance p1, Landroid/graphics/Rect;

    .line 37
    .line 38
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 39
    .line 40
    .line 41
    sget-object v3, La/hz6;->q2:[La/iiy;

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    aget-object v3, v3, v4

    .line 45
    .line 46
    iget-object v5, p0, La/hz6;->f2:La/khf0;

    .line 47
    .line 48
    invoke-virtual {v5, p0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Landroid/graphics/Rect;

    .line 53
    .line 54
    invoke-virtual {p1, v3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 55
    .line 56
    .line 57
    iget v3, v2, Landroid/graphics/Rect;->left:I

    .line 58
    .line 59
    neg-int v3, v3

    .line 60
    iget v2, v2, Landroid/graphics/Rect;->top:I

    .line 61
    .line 62
    neg-int v2, v2

    .line 63
    invoke-virtual {p1, v3, v2}, Landroid/graphics/Rect;->offset(II)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, La/hz6;->T0()La/vik;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    iget-object v2, v2, La/vik;->e:La/hsx;

    .line 71
    .line 72
    iget-object v2, v2, La/hsx;->b:Landroid/widget/TextView;

    .line 73
    .line 74
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    .line 80
    .line 81
    iget p2, v1, Landroid/graphics/Rect;->left:I

    .line 82
    .line 83
    int-to-float p2, p2

    .line 84
    invoke-virtual {v2, p2}, Landroid/view/View;->setX(F)V

    .line 85
    .line 86
    .line 87
    iget p2, v1, Landroid/graphics/Rect;->top:I

    .line 88
    .line 89
    int-to-float p2, p2

    .line 90
    invoke-virtual {v2, p2}, Landroid/view/View;->setY(F)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    iget v1, p1, Landroid/graphics/Rect;->left:I

    .line 101
    .line 102
    int-to-float v1, v1

    .line 103
    invoke-virtual {p2, v1}, Landroid/view/ViewPropertyAnimator;->x(F)Landroid/view/ViewPropertyAnimator;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 108
    .line 109
    int-to-float p1, p1

    .line 110
    invoke-virtual {p2, p1}, Landroid/view/ViewPropertyAnimator;->y(F)Landroid/view/ViewPropertyAnimator;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    new-instance p2, La/x73;

    .line 115
    .line 116
    new-instance v1, La/gj4;

    .line 117
    .line 118
    const/16 v2, 0x10

    .line 119
    .line 120
    invoke-direct {v1, v0, p3, v2}, La/gj4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 121
    .line 122
    .line 123
    const/16 p3, 0xb

    .line 124
    .line 125
    const/4 v0, 0x0

    .line 126
    invoke-direct {p2, v0, v1, p3}, La/x73;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, p2}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 133
    .line 134
    .line 135
    iput-object p1, p0, La/hz6;->i2:Landroid/view/ViewPropertyAnimator;

    .line 136
    .line 137
    return-void
.end method

.method public final Z()V
    .locals 1

    .line 1
    iget-object v0, p0, La/hz6;->j2:La/wjk;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, La/wjk;->l(La/wjk;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, La/hz6;->j2:La/wjk;

    .line 10
    .line 11
    invoke-super {p0}, La/nw5;->Z()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final e0()V
    .locals 0

    .line 1
    invoke-super {p0}, La/nw5;->e0()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/hz6;->j2:La/wjk;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, La/wjk;->l(La/wjk;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final h0()V
    .locals 0

    .line 1
    invoke-super {p0}, La/nw5;->h0()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/hz6;->i2:Landroid/view/ViewPropertyAnimator;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super/range {p0 .. p2}, La/nw5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, La/hz6;->U0()La/b07;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, La/b07;->p:La/ol60;

    .line 14
    .line 15
    new-instance v2, La/yp6;

    .line 16
    .line 17
    const/4 v3, 0x5

    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v2, v0, v4, v3}, La/yp6;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 20
    .line 21
    .line 22
    sget-object v3, La/lkz;->a:La/lkz;

    .line 23
    .line 24
    invoke-static {v0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    new-instance v6, La/td6;

    .line 37
    .line 38
    invoke-direct {v6, v1, v3, v2, v4}, La/td6;-><init>(La/gmq;La/clz;La/yp6;La/yje;)V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x3

    .line 42
    invoke-static {v5, v4, v4, v6, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, La/hz6;->T0()La/vik;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object v2, v2, La/vik;->e:La/hsx;

    .line 50
    .line 51
    iget-object v2, v2, La/hsx;->b:Landroid/widget/TextView;

    .line 52
    .line 53
    const/4 v3, 0x1

    .line 54
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setSelected(Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, La/hz6;->T0()La/vik;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iget-object v2, v2, La/vik;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 62
    .line 63
    iget-object v3, v0, La/hz6;->n2:La/n0o0;

    .line 64
    .line 65
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, La/c6s;

    .line 70
    .line 71
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 72
    .line 73
    .line 74
    new-instance v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 75
    .line 76
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    const/4 v6, 0x0

    .line 81
    invoke-direct {v3, v5, v6, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    const v5, 0x7f080486

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, v5}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    if-eqz v3, :cond_0

    .line 99
    .line 100
    new-instance v5, La/uwk;

    .line 101
    .line 102
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    invoke-direct {v5, v7, v6}, La/uwk;-><init>(Landroid/content/Context;I)V

    .line 107
    .line 108
    .line 109
    iput-object v3, v5, La/uwk;->a:Landroid/graphics/drawable/Drawable;

    .line 110
    .line 111
    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 112
    .line 113
    .line 114
    :cond_0
    invoke-virtual {v0}, La/hz6;->U0()La/b07;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    invoke-static {v10}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    new-instance v8, La/ur6;

    .line 123
    .line 124
    const/4 v14, 0x0

    .line 125
    const/16 v15, 0xe

    .line 126
    .line 127
    const/4 v9, 0x1

    .line 128
    const-class v11, La/b07;

    .line 129
    .line 130
    const-string v12, "handleShopLoadError"

    .line 131
    .line 132
    const-string v13, "handleShopLoadError(Ljava/lang/Throwable;)V"

    .line 133
    .line 134
    invoke-direct/range {v8 .. v15}, La/ur6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 135
    .line 136
    .line 137
    new-instance v15, La/mz6;

    .line 138
    .line 139
    const/4 v3, 0x2

    .line 140
    invoke-direct {v15, v10, v4, v3}, La/mz6;-><init>(La/b07;La/yje;B)V

    .line 141
    .line 142
    .line 143
    const/16 v16, 0xe

    .line 144
    .line 145
    const/4 v13, 0x0

    .line 146
    const/4 v14, 0x0

    .line 147
    move-object v11, v2

    .line 148
    move-object v12, v8

    .line 149
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, La/hz6;->T0()La/vik;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    iget-object v2, v2, La/vik;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 157
    .line 158
    new-instance v4, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 159
    .line 160
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-direct {v4, v5, v6, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, La/hz6;->T0()La/vik;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    iget-object v2, v2, La/vik;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 175
    .line 176
    iget-object v4, v0, La/hz6;->e2:La/o900;

    .line 177
    .line 178
    invoke-virtual {v4, v2}, La/efk0;->b(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0}, La/hz6;->T0()La/vik;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    iget-object v2, v2, La/vik;->d:Lorg/xplatform/bonus_games/impl/core/presentation/views/BetGameShopDotIndicatorView;

    .line 186
    .line 187
    sget-object v4, La/hz6;->q2:[La/iiy;

    .line 188
    .line 189
    aget-object v4, v4, v3

    .line 190
    .line 191
    iget-object v5, v0, La/hz6;->h2:La/zz2;

    .line 192
    .line 193
    invoke-virtual {v5, v0, v4}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    invoke-virtual {v2, v4}, Lorg/xplatform/bonus_games/impl/core/presentation/views/BetGameShopDotIndicatorView;->setHighlighted(I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0}, La/hz6;->T0()La/vik;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    iget-object v2, v2, La/vik;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 209
    .line 210
    new-instance v4, La/gz6;

    .line 211
    .line 212
    invoke-direct {v4, v0, v6}, La/gz6;-><init>(Ljava/lang/Object;B)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->o(La/lhe0;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, La/hz6;->T0()La/vik;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    iget-object v2, v2, La/vik;->c:Landroid/widget/Button;

    .line 223
    .line 224
    sget-object v4, La/ymx;->e:La/ymx;

    .line 225
    .line 226
    new-instance v5, La/os5;

    .line 227
    .line 228
    const/16 v6, 0x10

    .line 229
    .line 230
    invoke-direct {v5, v0, v6}, La/os5;-><init>(Ljava/lang/Object;B)V

    .line 231
    .line 232
    .line 233
    invoke-static {v2, v4, v5}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 234
    .line 235
    .line 236
    new-instance v2, La/dz6;

    .line 237
    .line 238
    const/4 v4, 0x4

    .line 239
    invoke-direct {v2, v0, v4}, La/dz6;-><init>(La/hz6;B)V

    .line 240
    .line 241
    .line 242
    const-string v4, "REQUEST_SHOW_INSUFFICIENT_DIALOG_KEY"

    .line 243
    .line 244
    invoke-static {v0, v4, v2}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 245
    .line 246
    .line 247
    new-instance v2, La/dz6;

    .line 248
    .line 249
    invoke-direct {v2, v0, v3}, La/dz6;-><init>(La/hz6;B)V

    .line 250
    .line 251
    .line 252
    const-string v3, "PROMO_REQUEST_DIALOG_RESTART_GAME_KEY"

    .line 253
    .line 254
    invoke-static {v0, v3, v2}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 255
    .line 256
    .line 257
    new-instance v2, La/dz6;

    .line 258
    .line 259
    invoke-direct {v2, v0, v1}, La/dz6;-><init>(La/hz6;B)V

    .line 260
    .line 261
    .line 262
    invoke-static {v0, v3, v2}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 263
    .line 264
    .line 265
    return-void
.end method

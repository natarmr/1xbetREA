.class public final synthetic La/c7g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/f7g;


# direct methods
.method public synthetic constructor <init>(La/f7g;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/c7g;->a:B

    iput-object p1, p0, La/c7g;->b:La/f7g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/c7g;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/c7g;->b:La/f7g;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/f7g;->o2:La/nwd;

    .line 9
    .line 10
    new-instance v0, La/x6g;

    .line 11
    .line 12
    new-instance v1, La/mhc;

    .line 13
    .line 14
    invoke-virtual {p0}, La/f7g;->W0()La/j7g;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const/4 v7, 0x0

    .line 19
    const/16 v8, 0x12

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    const-class v4, La/j7g;

    .line 23
    .line 24
    const-string v5, "onDisciplineItemClicked"

    .line 25
    .line 26
    const-string v6, "onDisciplineItemClicked(JZ)V"

    .line 27
    .line 28
    invoke-direct/range {v1 .. v8}, La/mhc;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 29
    .line 30
    .line 31
    sget-object p0, La/x6g;->f:La/ek5;

    .line 32
    .line 33
    invoke-direct {v0, p0}, La/qv5;-><init>(La/dtb;)V

    .line 34
    .line 35
    .line 36
    new-instance p0, La/jyf;

    .line 37
    .line 38
    const/16 v2, 0x8

    .line 39
    .line 40
    invoke-direct {p0, v2}, La/jyf;-><init>(B)V

    .line 41
    .line 42
    .line 43
    new-instance v2, La/ejd;

    .line 44
    .line 45
    const/16 v3, 0x1b

    .line 46
    .line 47
    invoke-direct {v2, v1, v3}, La/ejd;-><init>(Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    new-instance v1, La/pue;

    .line 51
    .line 52
    const/4 v3, 0x3

    .line 53
    const/16 v4, 0x9

    .line 54
    .line 55
    invoke-direct {v1, v3, v4}, La/pue;-><init>(IB)V

    .line 56
    .line 57
    .line 58
    sget-object v3, La/fpd;->v:La/fpd;

    .line 59
    .line 60
    new-instance v4, La/gbn;

    .line 61
    .line 62
    invoke-direct {v4, p0, v1, v2, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 63
    .line 64
    .line 65
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 66
    .line 67
    invoke-virtual {p0, v4}, La/dp;->b(La/gbn;)V

    .line 68
    .line 69
    .line 70
    return-object v0

    .line 71
    :pswitch_0
    new-instance v0, La/q0h0;

    .line 72
    .line 73
    iget-object p0, p0, La/f7g;->g2:La/xdi;

    .line 74
    .line 75
    if-eqz p0, :cond_0

    .line 76
    .line 77
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 78
    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_0
    const-string p0, "viewModelFactory"

    .line 82
    .line 83
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const/4 p0, 0x0

    .line 87
    throw p0

    .line 88
    :pswitch_1
    sget-object v0, La/f7g;->o2:La/nwd;

    .line 89
    .line 90
    invoke-virtual {p0}, La/f7g;->V0()La/b7g;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget-object v0, v0, La/b7g;->e:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 95
    .line 96
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->clearFocus()V

    .line 97
    .line 98
    .line 99
    invoke-static {p0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 100
    .line 101
    .line 102
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

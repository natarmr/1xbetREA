.class public final synthetic La/uqz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wqz;


# direct methods
.method public synthetic constructor <init>(La/wqz;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uqz;->a:B

    iput-object p1, p0, La/uqz;->b:La/wqz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/uqz;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/uqz;->b:La/wqz;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/wqz;->Q1:La/bst;

    .line 9
    .line 10
    iget-object p0, p0, La/wqz;->K1:La/fiu0;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const-string p0, "viewModelFactory"

    .line 16
    .line 17
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    throw p0

    .line 22
    :pswitch_0
    sget-object v0, La/wqz;->Q1:La/bst;

    .line 23
    .line 24
    invoke-virtual {p0}, La/wqz;->G0()La/k3t0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    sget-object v0, La/oqz;->a:La/oqz;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_1
    sget-object v0, La/wqz;->Q1:La/bst;

    .line 37
    .line 38
    invoke-virtual {p0}, La/wqz;->G0()La/k3t0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, La/pqz;

    .line 43
    .line 44
    iget-object v2, p0, La/wqz;->N1:La/zz2;

    .line 45
    .line 46
    sget-object v3, La/wqz;->R1:[La/iiy;

    .line 47
    .line 48
    const/4 v4, 0x1

    .line 49
    aget-object v4, v3, v4

    .line 50
    .line 51
    invoke-virtual {v2, p0, v4}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    iget-object v4, p0, La/wqz;->O1:La/phf0;

    .line 60
    .line 61
    const/4 v5, 0x2

    .line 62
    aget-object v3, v3, v5

    .line 63
    .line 64
    invoke-virtual {v4, p0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-direct {v1, v2, p0}, La/pqz;-><init>(ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

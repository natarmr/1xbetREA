.class public final synthetic La/lnl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:S

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:La/wdr;

.field public final synthetic j:La/wdr;

.field public final synthetic k:La/wdr;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/o5m;La/h5m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    .line 2
    const/4 p10, 0x1

    iput-byte p10, p0, La/lnl;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/lnl;->b:La/mm40;

    iput-object p2, p0, La/lnl;->g:Ljava/lang/Object;

    iput-object p3, p0, La/lnl;->h:Ljava/lang/Object;

    iput-object p4, p0, La/lnl;->i:La/wdr;

    iput-object p5, p0, La/lnl;->c:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, La/lnl;->d:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, La/lnl;->e:Lkotlin/jvm/functions/Function0;

    iput-object p8, p0, La/lnl;->j:La/wdr;

    iput-object p9, p0, La/lnl;->k:La/wdr;

    iput-short p11, p0, La/lnl;->f:S

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/wzh;La/hnl;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)V
    .locals 0

    .line 1
    const/4 p10, 0x0

    iput-byte p10, p0, La/lnl;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/lnl;->b:La/mm40;

    iput-object p2, p0, La/lnl;->g:Ljava/lang/Object;

    iput-object p3, p0, La/lnl;->h:Ljava/lang/Object;

    iput-object p4, p0, La/lnl;->c:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, La/lnl;->d:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, La/lnl;->e:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, La/lnl;->i:La/wdr;

    iput-object p8, p0, La/lnl;->j:La/wdr;

    iput-object p9, p0, La/lnl;->k:La/wdr;

    iput-short p11, p0, La/lnl;->f:S

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lnl;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, La/lnl;->k:La/wdr;

    .line 7
    .line 8
    iget-object v4, v0, La/lnl;->j:La/wdr;

    .line 9
    .line 10
    iget-object v5, v0, La/lnl;->i:La/wdr;

    .line 11
    .line 12
    iget-object v6, v0, La/lnl;->h:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v7, v0, La/lnl;->g:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object v9, v7

    .line 20
    check-cast v9, La/o5m;

    .line 21
    .line 22
    move-object v10, v6

    .line 23
    check-cast v10, La/h5m;

    .line 24
    .line 25
    move-object v11, v5

    .line 26
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    move-object v15, v4

    .line 29
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    move-object/from16 v16, v3

    .line 32
    .line 33
    check-cast v16, Lkotlin/jvm/functions/Function1;

    .line 34
    .line 35
    move-object/from16 v17, p1

    .line 36
    .line 37
    check-cast v17, La/fet;

    .line 38
    .line 39
    move-object/from16 v1, p2

    .line 40
    .line 41
    check-cast v1, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {v2}, La/x8x;->L(I)I

    .line 47
    .line 48
    .line 49
    move-result v18

    .line 50
    iget-object v8, v0, La/lnl;->b:La/mm40;

    .line 51
    .line 52
    iget-object v12, v0, La/lnl;->c:Lkotlin/jvm/functions/Function0;

    .line 53
    .line 54
    iget-object v13, v0, La/lnl;->d:Lkotlin/jvm/functions/Function0;

    .line 55
    .line 56
    iget-object v14, v0, La/lnl;->e:Lkotlin/jvm/functions/Function0;

    .line 57
    .line 58
    iget-short v0, v0, La/lnl;->f:S

    .line 59
    .line 60
    move/from16 v19, v0

    .line 61
    .line 62
    invoke-static/range {v8 .. v19}, La/j5m;->a(La/mm40;La/o5m;La/h5m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 63
    .line 64
    .line 65
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object v0

    .line 68
    :pswitch_0
    check-cast v7, La/wzh;

    .line 69
    .line 70
    check-cast v6, La/hnl;

    .line 71
    .line 72
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 73
    .line 74
    move-object v8, v4

    .line 75
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 76
    .line 77
    move-object v9, v3

    .line 78
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 79
    .line 80
    move-object/from16 v10, p1

    .line 81
    .line 82
    check-cast v10, La/fet;

    .line 83
    .line 84
    move-object/from16 v1, p2

    .line 85
    .line 86
    check-cast v1, Ljava/lang/Integer;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-static {v2}, La/x8x;->L(I)I

    .line 92
    .line 93
    .line 94
    move-result v11

    .line 95
    iget-object v1, v0, La/lnl;->b:La/mm40;

    .line 96
    .line 97
    iget-object v4, v0, La/lnl;->c:Lkotlin/jvm/functions/Function0;

    .line 98
    .line 99
    move-object v2, v7

    .line 100
    move-object v7, v5

    .line 101
    iget-object v5, v0, La/lnl;->d:Lkotlin/jvm/functions/Function0;

    .line 102
    .line 103
    move-object v3, v6

    .line 104
    iget-object v6, v0, La/lnl;->e:Lkotlin/jvm/functions/Function0;

    .line 105
    .line 106
    iget-short v12, v0, La/lnl;->f:S

    .line 107
    .line 108
    invoke-static/range {v1 .. v12}, La/slb;->k(La/mm40;La/wzh;La/hnl;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 109
    .line 110
    .line 111
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object v0

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

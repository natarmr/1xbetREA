.class public final synthetic La/udc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wdc;


# direct methods
.method public synthetic constructor <init>(La/wdc;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/udc;->a:B

    iput-object p1, p0, La/udc;->b:La/wdc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/udc;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/udc;->b:La/wdc;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Throwable;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 18
    .line 19
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 29
    .line 30
    move-object v5, v3

    .line 31
    check-cast v5, La/rdc;

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const/16 v16, 0x0

    .line 37
    .line 38
    const/16 v17, 0x17f

    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    const-wide/16 v7, 0x0

    .line 42
    .line 43
    const/4 v9, 0x0

    .line 44
    const/4 v10, 0x0

    .line 45
    const/4 v11, 0x0

    .line 46
    const-wide/16 v12, 0x0

    .line 47
    .line 48
    const/4 v14, 0x0

    .line 49
    const/4 v15, 0x0

    .line 50
    invoke-static/range {v5 .. v17}, La/rdc;->a(La/rdc;Ljava/util/List;DLa/i8r;Ljava/lang/String;ZDLjava/lang/Double;ZLa/z85;I)La/rdc;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_0

    .line 59
    .line 60
    iget-object v0, v0, La/wdc;->q:La/duj;

    .line 61
    .line 62
    new-instance v2, La/pua;

    .line 63
    .line 64
    const/16 v3, 0x1d

    .line 65
    .line 66
    invoke-direct {v2, v3}, La/pua;-><init>(B)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 70
    .line 71
    .line 72
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_0
    move-object/from16 v1, p1

    .line 76
    .line 77
    check-cast v1, Ljava/lang/Throwable;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object v0, v0, La/wdc;->q:La/duj;

    .line 83
    .line 84
    new-instance v2, La/pua;

    .line 85
    .line 86
    const/16 v3, 0x1c

    .line 87
    .line 88
    invoke-direct {v2, v3}, La/pua;-><init>(B)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 92
    .line 93
    .line 94
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object v0

    .line 97
    :pswitch_1
    move-object/from16 v1, p1

    .line 98
    .line 99
    check-cast v1, Ljava/lang/Throwable;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget-object v2, v0, La/wdc;->q:La/duj;

    .line 105
    .line 106
    new-instance v3, La/bna;

    .line 107
    .line 108
    const/16 v4, 0x1a

    .line 109
    .line 110
    invoke-direct {v3, v0, v4}, La/bna;-><init>(Ljava/lang/Object;B)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 114
    .line 115
    .line 116
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object v0

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

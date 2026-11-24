.class public final synthetic La/vao0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ivk0;

.field public final synthetic c:La/ebo0;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/ivk0;La/ebo0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/vao0;->a:B

    iput-object p1, p0, La/vao0;->b:La/ivk0;

    iput-object p2, p0, La/vao0;->c:La/ebo0;

    iput-object p3, p0, La/vao0;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/vao0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x10

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, La/vao0;->b:La/ivk0;

    .line 8
    .line 9
    check-cast p1, La/y5d;

    .line 10
    .line 11
    move-object v10, p2

    .line 12
    check-cast v10, La/fet;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v0, p3

    .line 18
    .line 19
    check-cast v0, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    and-int/lit8 p1, v0, 0x11

    .line 29
    .line 30
    if-eq p1, v2, :cond_0

    .line 31
    .line 32
    move v1, v3

    .line 33
    :cond_0
    and-int/lit8 p1, v0, 0x1

    .line 34
    .line 35
    invoke-virtual {v10, p1, v1}, La/fet;->U(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    iget-object v6, v4, La/ivk0;->a:La/a4x;

    .line 42
    .line 43
    iget-object v8, v4, La/ivk0;->b:La/l7m0;

    .line 44
    .line 45
    const/4 v11, 0x0

    .line 46
    const/4 v12, 0x1

    .line 47
    const/4 v5, 0x0

    .line 48
    iget-object v7, p0, La/vao0;->c:La/ebo0;

    .line 49
    .line 50
    iget-object v9, p0, La/vao0;->d:Lkotlin/jvm/functions/Function1;

    .line 51
    .line 52
    invoke-static/range {v5 .. v12}, La/q5x;->h(La/mm40;La/a4x;La/ebo0;La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {v10}, La/fet;->X()V

    .line 57
    .line 58
    .line 59
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_0
    move-object/from16 v0, p3

    .line 63
    .line 64
    check-cast v0, Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    and-int/lit8 p1, v0, 0x11

    .line 74
    .line 75
    if-eq p1, v2, :cond_2

    .line 76
    .line 77
    move v1, v3

    .line 78
    :cond_2
    and-int/lit8 p1, v0, 0x1

    .line 79
    .line 80
    invoke-virtual {v10, p1, v1}, La/fet;->U(IZ)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_3

    .line 85
    .line 86
    invoke-static {v10}, La/x0x;->a0(La/fet;)La/bk50;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    const/4 v0, 0x0

    .line 91
    sget-object v1, La/jm40;->b:La/jm40;

    .line 92
    .line 93
    invoke-static {v1, p1, v0}, La/cjx;->V(La/mm40;La/vj50;La/yj50;)La/mm40;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    iget-object v6, v4, La/ivk0;->a:La/a4x;

    .line 98
    .line 99
    iget-object v8, v4, La/ivk0;->b:La/l7m0;

    .line 100
    .line 101
    const/4 v11, 0x0

    .line 102
    const/4 v12, 0x0

    .line 103
    iget-object v7, p0, La/vao0;->c:La/ebo0;

    .line 104
    .line 105
    iget-object v9, p0, La/vao0;->d:Lkotlin/jvm/functions/Function1;

    .line 106
    .line 107
    invoke-static/range {v5 .. v12}, La/q5x;->h(La/mm40;La/a4x;La/ebo0;La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    invoke-virtual {v10}, La/fet;->X()V

    .line 112
    .line 113
    .line 114
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

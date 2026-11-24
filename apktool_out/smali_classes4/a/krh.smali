.class public final synthetic La/krh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:J

.field public final synthetic d:I

.field public final synthetic e:B

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/a4x;La/hxh0;La/dxh0;La/ycl;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/krh;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/krh;->b:La/mm40;

    iput-object p2, p0, La/krh;->f:Ljava/lang/Object;

    iput-object p3, p0, La/krh;->g:Ljava/lang/Object;

    iput-object p4, p0, La/krh;->h:Ljava/lang/Object;

    iput-object p5, p0, La/krh;->i:Ljava/lang/Object;

    iput-wide p6, p0, La/krh;->c:J

    iput-object p8, p0, La/krh;->j:Ljava/lang/Object;

    iput-object p9, p0, La/krh;->k:Ljava/lang/Object;

    iput p10, p0, La/krh;->d:I

    iput-byte p11, p0, La/krh;->e:B

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/mm40;La/o0x;La/m0x;JLa/u12;La/a4d;La/qge;II)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/krh;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/krh;->b:La/mm40;

    iput-object p2, p0, La/krh;->f:Ljava/lang/Object;

    iput-object p3, p0, La/krh;->g:Ljava/lang/Object;

    iput-object p4, p0, La/krh;->h:Ljava/lang/Object;

    iput-wide p5, p0, La/krh;->c:J

    iput-object p7, p0, La/krh;->i:Ljava/lang/Object;

    iput-object p8, p0, La/krh;->j:Ljava/lang/Object;

    iput-object p9, p0, La/krh;->k:Ljava/lang/Object;

    iput p10, p0, La/krh;->d:I

    iput-byte p11, p0, La/krh;->e:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/krh;->a:B

    .line 4
    .line 5
    iget v2, v0, La/krh;->d:I

    .line 6
    .line 7
    iget-object v3, v0, La/krh;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/krh;->j:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/krh;->i:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, La/krh;->h:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v0, La/krh;->g:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v8, v0, La/krh;->f:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object v10, v8

    .line 23
    check-cast v10, La/a4x;

    .line 24
    .line 25
    move-object v11, v7

    .line 26
    check-cast v11, La/hxh0;

    .line 27
    .line 28
    move-object v12, v6

    .line 29
    check-cast v12, La/dxh0;

    .line 30
    .line 31
    move-object v13, v5

    .line 32
    check-cast v13, La/ycl;

    .line 33
    .line 34
    move-object/from16 v16, v4

    .line 35
    .line 36
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 37
    .line 38
    move-object/from16 v17, v3

    .line 39
    .line 40
    check-cast v17, Lkotlin/jvm/functions/Function1;

    .line 41
    .line 42
    move-object/from16 v18, p1

    .line 43
    .line 44
    check-cast v18, La/fet;

    .line 45
    .line 46
    move-object/from16 v1, p2

    .line 47
    .line 48
    check-cast v1, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    or-int/lit8 v1, v2, 0x1

    .line 54
    .line 55
    invoke-static {v1}, La/x8x;->L(I)I

    .line 56
    .line 57
    .line 58
    move-result v19

    .line 59
    iget-object v9, v0, La/krh;->b:La/mm40;

    .line 60
    .line 61
    iget-wide v14, v0, La/krh;->c:J

    .line 62
    .line 63
    iget-byte v0, v0, La/krh;->e:B

    .line 64
    .line 65
    move/from16 v20, v0

    .line 66
    .line 67
    invoke-static/range {v9 .. v20}, La/ntb;->n(La/mm40;La/a4x;La/hxh0;La/dxh0;La/ycl;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 68
    .line 69
    .line 70
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object v0

    .line 73
    :pswitch_0
    check-cast v8, La/mm40;

    .line 74
    .line 75
    check-cast v7, La/o0x;

    .line 76
    .line 77
    check-cast v6, La/m0x;

    .line 78
    .line 79
    check-cast v5, La/u12;

    .line 80
    .line 81
    check-cast v4, La/a4d;

    .line 82
    .line 83
    move-object v9, v3

    .line 84
    check-cast v9, La/qge;

    .line 85
    .line 86
    move-object/from16 v10, p1

    .line 87
    .line 88
    check-cast v10, La/fet;

    .line 89
    .line 90
    move-object/from16 v1, p2

    .line 91
    .line 92
    check-cast v1, Ljava/lang/Integer;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    or-int/lit8 v1, v2, 0x1

    .line 98
    .line 99
    invoke-static {v1}, La/x8x;->L(I)I

    .line 100
    .line 101
    .line 102
    move-result v11

    .line 103
    iget-object v1, v0, La/krh;->b:La/mm40;

    .line 104
    .line 105
    move-object v3, v7

    .line 106
    move-object v2, v8

    .line 107
    move-object v8, v4

    .line 108
    move-object v7, v5

    .line 109
    move-object v4, v6

    .line 110
    iget-wide v5, v0, La/krh;->c:J

    .line 111
    .line 112
    iget-byte v12, v0, La/krh;->e:B

    .line 113
    .line 114
    invoke-static/range {v1 .. v12}, La/lgb;->w(La/mm40;La/mm40;La/o0x;La/m0x;JLa/u12;La/a4d;La/qge;La/fet;II)V

    .line 115
    .line 116
    .line 117
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object v0

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

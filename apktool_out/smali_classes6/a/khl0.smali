.class public final synthetic La/khl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:La/l7m0;

.field public final synthetic e:J

.field public final synthetic f:J

.field public final synthetic g:J

.field public final synthetic h:Lkotlin/jvm/functions/Function0;

.field public final synthetic i:Lkotlin/jvm/functions/Function0;

.field public final synthetic j:La/ugd;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/l7m0;La/l7m0;JJJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ugd;IB)V
    .locals 0

    .line 1
    iput-byte p14, p0, La/khl0;->a:B

    iput-object p1, p0, La/khl0;->b:La/mm40;

    iput-object p2, p0, La/khl0;->c:La/l7m0;

    iput-object p3, p0, La/khl0;->d:La/l7m0;

    iput-wide p4, p0, La/khl0;->e:J

    iput-wide p6, p0, La/khl0;->f:J

    iput-wide p8, p0, La/khl0;->g:J

    iput-object p10, p0, La/khl0;->h:Lkotlin/jvm/functions/Function0;

    iput-object p11, p0, La/khl0;->i:Lkotlin/jvm/functions/Function0;

    iput-object p12, p0, La/khl0;->j:La/ugd;

    iput p13, p0, La/khl0;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/khl0;->a:B

    .line 4
    .line 5
    iget v2, v0, La/khl0;->k:I

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v15, p1

    .line 11
    .line 12
    check-cast v15, La/fet;

    .line 13
    .line 14
    move-object/from16 v1, p2

    .line 15
    .line 16
    check-cast v1, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    or-int/lit8 v1, v2, 0x1

    .line 22
    .line 23
    invoke-static {v1}, La/x8x;->L(I)I

    .line 24
    .line 25
    .line 26
    move-result v16

    .line 27
    iget-object v3, v0, La/khl0;->b:La/mm40;

    .line 28
    .line 29
    iget-object v4, v0, La/khl0;->c:La/l7m0;

    .line 30
    .line 31
    iget-object v5, v0, La/khl0;->d:La/l7m0;

    .line 32
    .line 33
    iget-wide v6, v0, La/khl0;->e:J

    .line 34
    .line 35
    iget-wide v8, v0, La/khl0;->f:J

    .line 36
    .line 37
    iget-wide v10, v0, La/khl0;->g:J

    .line 38
    .line 39
    iget-object v12, v0, La/khl0;->h:Lkotlin/jvm/functions/Function0;

    .line 40
    .line 41
    iget-object v13, v0, La/khl0;->i:Lkotlin/jvm/functions/Function0;

    .line 42
    .line 43
    iget-object v14, v0, La/khl0;->j:La/ugd;

    .line 44
    .line 45
    invoke-static/range {v3 .. v16}, La/m8x;->i(La/mm40;La/l7m0;La/l7m0;JJJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ugd;La/fet;I)V

    .line 46
    .line 47
    .line 48
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_0
    move-object/from16 v13, p1

    .line 52
    .line 53
    check-cast v13, La/fet;

    .line 54
    .line 55
    move-object/from16 v1, p2

    .line 56
    .line 57
    check-cast v1, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    or-int/lit8 v1, v2, 0x1

    .line 63
    .line 64
    invoke-static {v1}, La/x8x;->L(I)I

    .line 65
    .line 66
    .line 67
    move-result v14

    .line 68
    iget-object v1, v0, La/khl0;->b:La/mm40;

    .line 69
    .line 70
    iget-object v2, v0, La/khl0;->c:La/l7m0;

    .line 71
    .line 72
    iget-object v3, v0, La/khl0;->d:La/l7m0;

    .line 73
    .line 74
    iget-wide v4, v0, La/khl0;->e:J

    .line 75
    .line 76
    iget-wide v6, v0, La/khl0;->f:J

    .line 77
    .line 78
    iget-wide v8, v0, La/khl0;->g:J

    .line 79
    .line 80
    iget-object v10, v0, La/khl0;->h:Lkotlin/jvm/functions/Function0;

    .line 81
    .line 82
    iget-object v11, v0, La/khl0;->i:Lkotlin/jvm/functions/Function0;

    .line 83
    .line 84
    iget-object v12, v0, La/khl0;->j:La/ugd;

    .line 85
    .line 86
    invoke-static/range {v1 .. v14}, La/l8x;->o(La/mm40;La/l7m0;La/l7m0;JJJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ugd;La/fet;I)V

    .line 87
    .line 88
    .line 89
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object v0

    .line 92
    :pswitch_1
    move-object/from16 v13, p1

    .line 93
    .line 94
    check-cast v13, La/fet;

    .line 95
    .line 96
    move-object/from16 v1, p2

    .line 97
    .line 98
    check-cast v1, Ljava/lang/Integer;

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    or-int/lit8 v1, v2, 0x1

    .line 104
    .line 105
    invoke-static {v1}, La/x8x;->L(I)I

    .line 106
    .line 107
    .line 108
    move-result v14

    .line 109
    iget-object v1, v0, La/khl0;->b:La/mm40;

    .line 110
    .line 111
    iget-object v2, v0, La/khl0;->c:La/l7m0;

    .line 112
    .line 113
    iget-object v3, v0, La/khl0;->d:La/l7m0;

    .line 114
    .line 115
    iget-wide v4, v0, La/khl0;->e:J

    .line 116
    .line 117
    iget-wide v6, v0, La/khl0;->f:J

    .line 118
    .line 119
    iget-wide v8, v0, La/khl0;->g:J

    .line 120
    .line 121
    iget-object v10, v0, La/khl0;->h:Lkotlin/jvm/functions/Function0;

    .line 122
    .line 123
    iget-object v11, v0, La/khl0;->i:Lkotlin/jvm/functions/Function0;

    .line 124
    .line 125
    iget-object v12, v0, La/khl0;->j:La/ugd;

    .line 126
    .line 127
    invoke-static/range {v1 .. v14}, La/h8x;->e(La/mm40;La/l7m0;La/l7m0;JJJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ugd;La/fet;I)V

    .line 128
    .line 129
    .line 130
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

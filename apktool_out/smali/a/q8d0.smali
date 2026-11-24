.class public final synthetic La/q8d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:J

.field public final synthetic f:La/yjj0;

.field public final synthetic g:Z

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/xdr;


# direct methods
.method public synthetic constructor <init>(La/mm40;FFJLa/yjj0;Ljava/util/List;ZLkotlin/jvm/functions/Function2;La/xdr;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/q8d0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/q8d0;->b:La/mm40;

    iput p2, p0, La/q8d0;->c:F

    iput p3, p0, La/q8d0;->d:F

    iput-wide p4, p0, La/q8d0;->e:J

    iput-object p6, p0, La/q8d0;->f:La/yjj0;

    iput-object p7, p0, La/q8d0;->i:Ljava/lang/Object;

    iput-boolean p8, p0, La/q8d0;->g:Z

    iput-object p9, p0, La/q8d0;->j:Ljava/lang/Object;

    iput-object p10, p0, La/q8d0;->k:La/xdr;

    iput p11, p0, La/q8d0;->h:I

    return-void
.end method

.method public synthetic constructor <init>(La/v8d0;La/d9d0;ZLa/mm40;FLa/yjj0;JFLa/ugd;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/q8d0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/q8d0;->i:Ljava/lang/Object;

    iput-object p2, p0, La/q8d0;->j:Ljava/lang/Object;

    iput-boolean p3, p0, La/q8d0;->g:Z

    iput-object p4, p0, La/q8d0;->b:La/mm40;

    iput p5, p0, La/q8d0;->c:F

    iput-object p6, p0, La/q8d0;->f:La/yjj0;

    iput-wide p7, p0, La/q8d0;->e:J

    iput p9, p0, La/q8d0;->d:F

    iput-object p10, p0, La/q8d0;->k:La/xdr;

    iput p11, p0, La/q8d0;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/q8d0;->a:B

    .line 4
    .line 5
    iget v2, v0, La/q8d0;->h:I

    .line 6
    .line 7
    iget-object v3, v0, La/q8d0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/q8d0;->i:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v11, v4

    .line 15
    check-cast v11, Ljava/util/List;

    .line 16
    .line 17
    move-object v13, v3

    .line 18
    check-cast v13, Lkotlin/jvm/functions/Function2;

    .line 19
    .line 20
    move-object/from16 v15, p1

    .line 21
    .line 22
    check-cast v15, La/fet;

    .line 23
    .line 24
    move-object/from16 v1, p2

    .line 25
    .line 26
    check-cast v1, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    or-int/lit8 v1, v2, 0x1

    .line 32
    .line 33
    invoke-static {v1}, La/x8x;->L(I)I

    .line 34
    .line 35
    .line 36
    move-result v16

    .line 37
    iget-object v5, v0, La/q8d0;->b:La/mm40;

    .line 38
    .line 39
    iget v6, v0, La/q8d0;->c:F

    .line 40
    .line 41
    iget v7, v0, La/q8d0;->d:F

    .line 42
    .line 43
    iget-wide v8, v0, La/q8d0;->e:J

    .line 44
    .line 45
    iget-object v10, v0, La/q8d0;->f:La/yjj0;

    .line 46
    .line 47
    iget-boolean v12, v0, La/q8d0;->g:Z

    .line 48
    .line 49
    iget-object v14, v0, La/q8d0;->k:La/xdr;

    .line 50
    .line 51
    invoke-static/range {v5 .. v16}, La/bdx;->C(La/mm40;FFJLa/yjj0;Ljava/util/List;ZLkotlin/jvm/functions/Function2;La/xdr;La/fet;I)V

    .line 52
    .line 53
    .line 54
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object v0

    .line 57
    :pswitch_0
    move-object v1, v4

    .line 58
    check-cast v1, La/v8d0;

    .line 59
    .line 60
    check-cast v3, La/d9d0;

    .line 61
    .line 62
    iget-object v4, v0, La/q8d0;->k:La/xdr;

    .line 63
    .line 64
    move-object v10, v4

    .line 65
    check-cast v10, La/ugd;

    .line 66
    .line 67
    move-object/from16 v11, p1

    .line 68
    .line 69
    check-cast v11, La/fet;

    .line 70
    .line 71
    move-object/from16 v4, p2

    .line 72
    .line 73
    check-cast v4, Ljava/lang/Integer;

    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    or-int/lit8 v2, v2, 0x1

    .line 79
    .line 80
    invoke-static {v2}, La/x8x;->L(I)I

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    move-object v2, v3

    .line 85
    iget-boolean v3, v0, La/q8d0;->g:Z

    .line 86
    .line 87
    iget-object v4, v0, La/q8d0;->b:La/mm40;

    .line 88
    .line 89
    iget v5, v0, La/q8d0;->c:F

    .line 90
    .line 91
    iget-object v6, v0, La/q8d0;->f:La/yjj0;

    .line 92
    .line 93
    iget-wide v7, v0, La/q8d0;->e:J

    .line 94
    .line 95
    iget v9, v0, La/q8d0;->d:F

    .line 96
    .line 97
    invoke-virtual/range {v1 .. v12}, La/v8d0;->b(La/d9d0;ZLa/mm40;FLa/yjj0;JFLa/ugd;La/fet;I)V

    .line 98
    .line 99
    .line 100
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object v0

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

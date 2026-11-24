.class public final synthetic La/cs8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:F

.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:La/wdr;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/es8;ZJFJLa/xdr;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/cs8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/cs8;->g:Ljava/lang/Object;

    iput-object p2, p0, La/cs8;->h:Ljava/lang/Object;

    iput-boolean p3, p0, La/cs8;->b:Z

    iput-wide p4, p0, La/cs8;->c:J

    iput p6, p0, La/cs8;->e:F

    iput-wide p7, p0, La/cs8;->d:J

    iput-object p9, p0, La/cs8;->i:La/wdr;

    iput p10, p0, La/cs8;->f:I

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;Ljava/lang/String;JJFLkotlin/jvm/functions/Function0;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/cs8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/cs8;->b:Z

    iput-object p2, p0, La/cs8;->g:Ljava/lang/Object;

    iput-object p3, p0, La/cs8;->h:Ljava/lang/Object;

    iput-wide p4, p0, La/cs8;->c:J

    iput-wide p6, p0, La/cs8;->d:J

    iput p8, p0, La/cs8;->e:F

    iput-object p9, p0, La/cs8;->i:La/wdr;

    iput p10, p0, La/cs8;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cs8;->a:B

    .line 4
    .line 5
    iget v2, v0, La/cs8;->f:I

    .line 6
    .line 7
    iget-object v3, v0, La/cs8;->i:La/wdr;

    .line 8
    .line 9
    iget-object v4, v0, La/cs8;->h:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/cs8;->g:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object v7, v5

    .line 17
    check-cast v7, Ljava/lang/String;

    .line 18
    .line 19
    move-object v8, v4

    .line 20
    check-cast v8, Ljava/lang/String;

    .line 21
    .line 22
    move-object v14, v3

    .line 23
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 24
    .line 25
    move-object/from16 v15, p1

    .line 26
    .line 27
    check-cast v15, La/fet;

    .line 28
    .line 29
    move-object/from16 v1, p2

    .line 30
    .line 31
    check-cast v1, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    or-int/lit8 v1, v2, 0x1

    .line 37
    .line 38
    invoke-static {v1}, La/x8x;->L(I)I

    .line 39
    .line 40
    .line 41
    move-result v16

    .line 42
    iget-boolean v6, v0, La/cs8;->b:Z

    .line 43
    .line 44
    iget-wide v9, v0, La/cs8;->c:J

    .line 45
    .line 46
    iget-wide v11, v0, La/cs8;->d:J

    .line 47
    .line 48
    iget v13, v0, La/cs8;->e:F

    .line 49
    .line 50
    invoke-static/range {v6 .. v16}, La/k7x;->g(ZLjava/lang/String;Ljava/lang/String;JJFLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_0
    move-object v1, v5

    .line 57
    check-cast v1, La/mm40;

    .line 58
    .line 59
    check-cast v4, La/es8;

    .line 60
    .line 61
    move-object v9, v3

    .line 62
    check-cast v9, La/xdr;

    .line 63
    .line 64
    move-object/from16 v10, p1

    .line 65
    .line 66
    check-cast v10, La/fet;

    .line 67
    .line 68
    move-object/from16 v3, p2

    .line 69
    .line 70
    check-cast v3, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    or-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    invoke-static {v2}, La/x8x;->L(I)I

    .line 78
    .line 79
    .line 80
    move-result v11

    .line 81
    iget-boolean v3, v0, La/cs8;->b:Z

    .line 82
    .line 83
    move-object v2, v4

    .line 84
    iget-wide v4, v0, La/cs8;->c:J

    .line 85
    .line 86
    iget v6, v0, La/cs8;->e:F

    .line 87
    .line 88
    iget-wide v7, v0, La/cs8;->d:J

    .line 89
    .line 90
    invoke-static/range {v1 .. v11}, La/s5x0;->h(La/mm40;La/es8;ZJFJLa/xdr;La/fet;I)V

    .line 91
    .line 92
    .line 93
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object v0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

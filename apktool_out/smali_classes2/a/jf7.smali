.class public final synthetic La/jf7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/o2a0;JJI)V
    .locals 0

    .line 2
    const/4 p7, 0x1

    iput-byte p7, p0, La/jf7;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/jf7;->d:Ljava/lang/Object;

    iput-object p2, p0, La/jf7;->e:Ljava/lang/Object;

    iput-wide p3, p0, La/jf7;->b:J

    iput-wide p5, p0, La/jf7;->c:J

    return-void
.end method

.method public synthetic constructor <init>(La/qcq;JJLjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/jf7;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/jf7;->d:Ljava/lang/Object;

    iput-wide p2, p0, La/jf7;->b:J

    iput-wide p4, p0, La/jf7;->c:J

    iput-object p6, p0, La/jf7;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/jf7;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, La/jf7;->e:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, v0, La/jf7;->d:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object v5, v4

    .line 14
    check-cast v5, La/mm40;

    .line 15
    .line 16
    move-object v6, v3

    .line 17
    check-cast v6, La/o2a0;

    .line 18
    .line 19
    move-object/from16 v11, p1

    .line 20
    .line 21
    check-cast v11, La/fet;

    .line 22
    .line 23
    move-object/from16 v1, p2

    .line 24
    .line 25
    check-cast v1, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, La/x8x;->L(I)I

    .line 31
    .line 32
    .line 33
    move-result v12

    .line 34
    iget-wide v7, v0, La/jf7;->b:J

    .line 35
    .line 36
    iget-wide v9, v0, La/jf7;->c:J

    .line 37
    .line 38
    invoke-static/range {v5 .. v12}, La/g1x;->j(La/mm40;La/o2a0;JJLa/fet;I)V

    .line 39
    .line 40
    .line 41
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_0
    check-cast v4, La/qcq;

    .line 45
    .line 46
    move-object v9, v3

    .line 47
    check-cast v9, Ljava/lang/String;

    .line 48
    .line 49
    move-object/from16 v1, p1

    .line 50
    .line 51
    check-cast v1, La/oyg0;

    .line 52
    .line 53
    move-object/from16 v5, p2

    .line 54
    .line 55
    check-cast v5, La/hf7;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object v6, v4, La/qcq;->b:La/xrz;

    .line 64
    .line 65
    iget-boolean v11, v4, La/qcq;->e:Z

    .line 66
    .line 67
    iget-object v1, v4, La/qcq;->h:La/lrz;

    .line 68
    .line 69
    sget-object v3, La/lrz;->d:La/lrz;

    .line 70
    .line 71
    if-ne v1, v3, :cond_0

    .line 72
    .line 73
    :goto_0
    move v12, v2

    .line 74
    goto :goto_1

    .line 75
    :cond_0
    const/4 v2, 0x0

    .line 76
    goto :goto_0

    .line 77
    :goto_1
    iget-wide v1, v4, La/qcq;->m:D

    .line 78
    .line 79
    double-to-long v1, v1

    .line 80
    iget-wide v7, v4, La/qcq;->o:D

    .line 81
    .line 82
    double-to-long v7, v7

    .line 83
    iget-object v3, v4, La/qcq;->c:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    new-instance v10, La/af7;

    .line 89
    .line 90
    iget-wide v13, v0, La/jf7;->b:J

    .line 91
    .line 92
    move-wide v15, v1

    .line 93
    iget-wide v0, v0, La/jf7;->c:J

    .line 94
    .line 95
    move-wide/from16 v19, v0

    .line 96
    .line 97
    move-object/from16 v21, v3

    .line 98
    .line 99
    move-wide/from16 v17, v7

    .line 100
    .line 101
    invoke-direct/range {v10 .. v21}, La/af7;-><init>(ZZJJJJLjava/lang/String;)V

    .line 102
    .line 103
    .line 104
    move-object v7, v10

    .line 105
    const/4 v8, 0x0

    .line 106
    const/16 v10, 0x14

    .line 107
    .line 108
    invoke-static/range {v5 .. v10}, La/hf7;->a(La/hf7;La/xrz;La/af7;ZLjava/lang/String;I)La/hf7;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    return-object v0

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

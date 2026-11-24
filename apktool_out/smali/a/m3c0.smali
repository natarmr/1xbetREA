.class public final synthetic La/m3c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:La/mm40;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:F

.field public final synthetic g:B

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/v8d0;La/d9d0;ZLa/mm40;JJFII)V
    .locals 0

    .line 1
    const/4 p10, 0x1

    iput-byte p10, p0, La/m3c0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/m3c0;->h:Ljava/lang/Object;

    iput-object p2, p0, La/m3c0;->i:Ljava/lang/Object;

    iput-boolean p3, p0, La/m3c0;->b:Z

    iput-object p4, p0, La/m3c0;->c:La/mm40;

    iput-wide p5, p0, La/m3c0;->d:J

    iput-wide p7, p0, La/m3c0;->e:J

    iput p9, p0, La/m3c0;->f:F

    iput-byte p11, p0, La/m3c0;->g:B

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;La/mm40;JJIFLkotlin/jvm/functions/Function1;II)V
    .locals 0

    .line 2
    const/4 p10, 0x0

    iput-byte p10, p0, La/m3c0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/m3c0;->h:Ljava/lang/Object;

    iput-object p2, p0, La/m3c0;->c:La/mm40;

    iput-wide p3, p0, La/m3c0;->d:J

    iput-wide p5, p0, La/m3c0;->e:J

    iput-boolean p7, p0, La/m3c0;->b:Z

    iput p8, p0, La/m3c0;->f:F

    iput-object p9, p0, La/m3c0;->i:Ljava/lang/Object;

    iput-byte p11, p0, La/m3c0;->g:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/m3c0;->a:B

    .line 4
    .line 5
    const v2, 0x180001

    .line 6
    .line 7
    .line 8
    iget-object v3, v0, La/m3c0;->i:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v4, v0, La/m3c0;->h:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object v5, v4

    .line 16
    check-cast v5, La/v8d0;

    .line 17
    .line 18
    move-object v6, v3

    .line 19
    check-cast v6, La/d9d0;

    .line 20
    .line 21
    move-object/from16 v14, p1

    .line 22
    .line 23
    check-cast v14, La/fet;

    .line 24
    .line 25
    move-object/from16 v1, p2

    .line 26
    .line 27
    check-cast v1, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, La/x8x;->L(I)I

    .line 33
    .line 34
    .line 35
    move-result v15

    .line 36
    iget-boolean v7, v0, La/m3c0;->b:Z

    .line 37
    .line 38
    iget-object v8, v0, La/m3c0;->c:La/mm40;

    .line 39
    .line 40
    iget-wide v9, v0, La/m3c0;->d:J

    .line 41
    .line 42
    iget-wide v11, v0, La/m3c0;->e:J

    .line 43
    .line 44
    iget v13, v0, La/m3c0;->f:F

    .line 45
    .line 46
    iget-byte v0, v0, La/m3c0;->g:B

    .line 47
    .line 48
    move/from16 v16, v0

    .line 49
    .line 50
    invoke-virtual/range {v5 .. v16}, La/v8d0;->a(La/d9d0;ZLa/mm40;JJFLa/fet;II)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_0
    move-object v1, v4

    .line 57
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 58
    .line 59
    move-object v9, v3

    .line 60
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 61
    .line 62
    move-object/from16 v10, p1

    .line 63
    .line 64
    check-cast v10, La/fet;

    .line 65
    .line 66
    move-object/from16 v3, p2

    .line 67
    .line 68
    check-cast v3, Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {v2}, La/x8x;->L(I)I

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    iget-object v2, v0, La/m3c0;->c:La/mm40;

    .line 78
    .line 79
    iget-wide v3, v0, La/m3c0;->d:J

    .line 80
    .line 81
    iget-wide v5, v0, La/m3c0;->e:J

    .line 82
    .line 83
    iget-boolean v7, v0, La/m3c0;->b:Z

    .line 84
    .line 85
    iget v8, v0, La/m3c0;->f:F

    .line 86
    .line 87
    iget-byte v12, v0, La/m3c0;->g:B

    .line 88
    .line 89
    invoke-static/range {v1 .. v12}, La/p3c0;->c(Lkotlin/jvm/functions/Function0;La/mm40;JJIFLkotlin/jvm/functions/Function1;La/fet;II)V

    .line 90
    .line 91
    .line 92
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object v0

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

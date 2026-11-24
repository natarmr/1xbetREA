.class public final synthetic La/v5n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:I

.field public final synthetic h:Z


# direct methods
.method public synthetic constructor <init>(La/mm40;La/s4i;JJLa/qao0;IIB)V
    .locals 0

    .line 2
    iput-byte p10, p0, La/v5n;->a:B

    iput-object p1, p0, La/v5n;->b:La/mm40;

    iput-object p2, p0, La/v5n;->c:Ljava/lang/Object;

    iput-wide p3, p0, La/v5n;->d:J

    iput-wide p5, p0, La/v5n;->e:J

    iput-object p7, p0, La/v5n;->f:Ljava/lang/Object;

    iput p8, p0, La/v5n;->g:I

    iput-boolean p9, p0, La/v5n;->h:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/mm40;JJZI)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/v5n;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/v5n;->c:Ljava/lang/Object;

    iput-object p2, p0, La/v5n;->f:Ljava/lang/Object;

    iput-object p3, p0, La/v5n;->b:La/mm40;

    iput-wide p4, p0, La/v5n;->d:J

    iput-wide p6, p0, La/v5n;->e:J

    iput-boolean p8, p0, La/v5n;->h:Z

    iput p9, p0, La/v5n;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/v5n;->a:B

    .line 2
    .line 3
    iget v1, p0, La/v5n;->g:I

    .line 4
    .line 5
    iget-object v2, p0, La/v5n;->f:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/v5n;->c:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v4, v3

    .line 13
    check-cast v4, Ljava/lang/String;

    .line 14
    .line 15
    move-object v5, v2

    .line 16
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 17
    .line 18
    move-object v12, p1

    .line 19
    check-cast v12, La/fet;

    .line 20
    .line 21
    move-object/from16 v0, p2

    .line 22
    .line 23
    check-cast v0, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    or-int/lit8 v0, v1, 0x1

    .line 29
    .line 30
    invoke-static {v0}, La/x8x;->L(I)I

    .line 31
    .line 32
    .line 33
    move-result v13

    .line 34
    iget-object v6, p0, La/v5n;->b:La/mm40;

    .line 35
    .line 36
    iget-wide v7, p0, La/v5n;->d:J

    .line 37
    .line 38
    iget-wide v9, p0, La/v5n;->e:J

    .line 39
    .line 40
    iget-boolean v11, p0, La/v5n;->h:Z

    .line 41
    .line 42
    invoke-static/range {v4 .. v13}, La/s5x0;->e(Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/mm40;JJZLa/fet;I)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_0
    check-cast v3, La/s4i;

    .line 49
    .line 50
    move-object v6, v2

    .line 51
    check-cast v6, La/qao0;

    .line 52
    .line 53
    move-object v7, p1

    .line 54
    check-cast v7, La/fet;

    .line 55
    .line 56
    move-object/from16 v0, p2

    .line 57
    .line 58
    check-cast v0, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    or-int/lit8 v0, v1, 0x1

    .line 64
    .line 65
    invoke-static {v0}, La/x8x;->L(I)I

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    iget-object v0, p0, La/v5n;->b:La/mm40;

    .line 70
    .line 71
    move-object v1, v3

    .line 72
    iget-wide v2, p0, La/v5n;->d:J

    .line 73
    .line 74
    iget-wide v4, p0, La/v5n;->e:J

    .line 75
    .line 76
    iget-boolean v9, p0, La/v5n;->h:Z

    .line 77
    .line 78
    invoke-static/range {v0 .. v9}, La/z5n;->c(La/mm40;La/s4i;JJLa/qao0;La/fet;II)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_1
    check-cast v3, La/s4i;

    .line 85
    .line 86
    move-object v6, v2

    .line 87
    check-cast v6, La/qao0;

    .line 88
    .line 89
    move-object v7, p1

    .line 90
    check-cast v7, La/fet;

    .line 91
    .line 92
    move-object/from16 v0, p2

    .line 93
    .line 94
    check-cast v0, Ljava/lang/Integer;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    or-int/lit8 v0, v1, 0x1

    .line 100
    .line 101
    invoke-static {v0}, La/x8x;->L(I)I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    iget-object v0, p0, La/v5n;->b:La/mm40;

    .line 106
    .line 107
    move-object v1, v3

    .line 108
    iget-wide v2, p0, La/v5n;->d:J

    .line 109
    .line 110
    iget-wide v4, p0, La/v5n;->e:J

    .line 111
    .line 112
    iget-boolean v9, p0, La/v5n;->h:Z

    .line 113
    .line 114
    invoke-static/range {v0 .. v9}, La/z5n;->c(La/mm40;La/s4i;JJLa/qao0;La/fet;II)V

    .line 115
    .line 116
    .line 117
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

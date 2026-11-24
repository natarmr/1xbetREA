.class public final synthetic La/p0m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;JJLkotlin/jvm/functions/Function0;La/ugd;I)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput-byte v0, p0, La/p0m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/p0m;->e:Ljava/lang/Object;

    iput-wide p2, p0, La/p0m;->b:J

    iput-wide p4, p0, La/p0m;->c:J

    iput-object p6, p0, La/p0m;->f:Ljava/lang/Object;

    iput-object p7, p0, La/p0m;->g:Ljava/lang/Object;

    iput p8, p0, La/p0m;->d:I

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/tpe;La/ope;JJI)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput-byte v0, p0, La/p0m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/p0m;->e:Ljava/lang/Object;

    iput-object p2, p0, La/p0m;->f:Ljava/lang/Object;

    iput-object p3, p0, La/p0m;->g:Ljava/lang/Object;

    iput-wide p4, p0, La/p0m;->b:J

    iput-wide p6, p0, La/p0m;->c:J

    iput p8, p0, La/p0m;->d:I

    return-void
.end method

.method public synthetic constructor <init>(La/o0x;JLa/ut90;La/tt90;JI)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/p0m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/p0m;->e:Ljava/lang/Object;

    iput-wide p2, p0, La/p0m;->b:J

    iput-object p4, p0, La/p0m;->f:Ljava/lang/Object;

    iput-object p5, p0, La/p0m;->g:Ljava/lang/Object;

    iput-wide p6, p0, La/p0m;->c:J

    iput p8, p0, La/p0m;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/p0m;->a:B

    .line 2
    .line 3
    iget v1, p0, La/p0m;->d:I

    .line 4
    .line 5
    iget-object v2, p0, La/p0m;->g:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/p0m;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, La/p0m;->e:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v5, v4

    .line 15
    check-cast v5, La/mm40;

    .line 16
    .line 17
    move-object v10, v3

    .line 18
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 19
    .line 20
    move-object v11, v2

    .line 21
    check-cast v11, La/ugd;

    .line 22
    .line 23
    move-object v12, p1

    .line 24
    check-cast v12, La/fet;

    .line 25
    .line 26
    move-object/from16 v0, p2

    .line 27
    .line 28
    check-cast v0, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    or-int/lit8 v0, v1, 0x1

    .line 34
    .line 35
    invoke-static {v0}, La/x8x;->L(I)I

    .line 36
    .line 37
    .line 38
    move-result v13

    .line 39
    iget-wide v6, p0, La/p0m;->b:J

    .line 40
    .line 41
    iget-wide v8, p0, La/p0m;->c:J

    .line 42
    .line 43
    invoke-static/range {v5 .. v13}, La/r8x;->p(La/mm40;JJLkotlin/jvm/functions/Function0;La/ugd;La/fet;I)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_0
    move-object v0, v4

    .line 50
    check-cast v0, La/o0x;

    .line 51
    .line 52
    check-cast v3, La/ut90;

    .line 53
    .line 54
    move-object v4, v2

    .line 55
    check-cast v4, La/tt90;

    .line 56
    .line 57
    move-object v7, p1

    .line 58
    check-cast v7, La/fet;

    .line 59
    .line 60
    move-object/from16 v2, p2

    .line 61
    .line 62
    check-cast v2, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    or-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    invoke-static {v1}, La/x8x;->L(I)I

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    iget-wide v1, p0, La/p0m;->b:J

    .line 74
    .line 75
    iget-wide v5, p0, La/p0m;->c:J

    .line 76
    .line 77
    invoke-static/range {v0 .. v8}, La/ibc;->E(La/o0x;JLa/ut90;La/tt90;JLa/fet;I)V

    .line 78
    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_1
    move-object v0, v4

    .line 84
    check-cast v0, La/mm40;

    .line 85
    .line 86
    check-cast v3, La/tpe;

    .line 87
    .line 88
    check-cast v2, La/ope;

    .line 89
    .line 90
    move-object v7, p1

    .line 91
    check-cast v7, La/fet;

    .line 92
    .line 93
    move-object/from16 v4, p2

    .line 94
    .line 95
    check-cast v4, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    or-int/lit8 v1, v1, 0x1

    .line 101
    .line 102
    invoke-static {v1}, La/x8x;->L(I)I

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    move-object v1, v3

    .line 107
    iget-wide v3, p0, La/p0m;->b:J

    .line 108
    .line 109
    iget-wide v5, p0, La/p0m;->c:J

    .line 110
    .line 111
    invoke-static/range {v0 .. v8}, La/tdc;->z(La/mm40;La/tpe;La/ope;JJLa/fet;I)V

    .line 112
    .line 113
    .line 114
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic La/q0m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IJLa/ope;La/mm40;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/q0m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/q0m;->b:I

    iput-wide p2, p0, La/q0m;->c:J

    iput-object p4, p0, La/q0m;->e:Ljava/lang/Object;

    iput-object p5, p0, La/q0m;->f:Ljava/lang/Object;

    iput p6, p0, La/q0m;->d:I

    return-void
.end method

.method public synthetic constructor <init>(ILa/uam;La/a4x;JI)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/q0m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/q0m;->b:I

    iput-object p2, p0, La/q0m;->e:Ljava/lang/Object;

    iput-object p3, p0, La/q0m;->f:Ljava/lang/Object;

    iput-wide p4, p0, La/q0m;->c:J

    iput p6, p0, La/q0m;->d:I

    return-void
.end method

.method public synthetic constructor <init>(La/fpe;IJLa/mm40;I)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput-byte v0, p0, La/q0m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/q0m;->e:Ljava/lang/Object;

    iput p2, p0, La/q0m;->b:I

    iput-wide p3, p0, La/q0m;->c:J

    iput-object p5, p0, La/q0m;->f:Ljava/lang/Object;

    iput p6, p0, La/q0m;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/q0m;->a:B

    .line 2
    .line 3
    iget v1, p0, La/q0m;->d:I

    .line 4
    .line 5
    iget-object v2, p0, La/q0m;->f:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/q0m;->e:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v4, v3

    .line 13
    check-cast v4, La/fpe;

    .line 14
    .line 15
    move-object v8, v2

    .line 16
    check-cast v8, La/mm40;

    .line 17
    .line 18
    move-object v9, p1

    .line 19
    check-cast v9, La/fet;

    .line 20
    .line 21
    check-cast p2, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    or-int/lit8 p1, v1, 0x1

    .line 27
    .line 28
    invoke-static {p1}, La/x8x;->L(I)I

    .line 29
    .line 30
    .line 31
    move-result v10

    .line 32
    iget v5, p0, La/q0m;->b:I

    .line 33
    .line 34
    iget-wide v6, p0, La/q0m;->c:J

    .line 35
    .line 36
    invoke-static/range {v4 .. v10}, La/l8x;->l(La/fpe;IJLa/mm40;La/fet;I)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_0
    check-cast v3, La/uam;

    .line 43
    .line 44
    check-cast v2, La/a4x;

    .line 45
    .line 46
    move-object v5, p1

    .line 47
    check-cast v5, La/fet;

    .line 48
    .line 49
    check-cast p2, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    or-int/lit8 p1, v1, 0x1

    .line 55
    .line 56
    invoke-static {p1}, La/x8x;->L(I)I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    iget v0, p0, La/q0m;->b:I

    .line 61
    .line 62
    move-object v1, v3

    .line 63
    iget-wide v3, p0, La/q0m;->c:J

    .line 64
    .line 65
    invoke-static/range {v0 .. v6}, La/kbc;->z(ILa/uam;La/a4x;JLa/fet;I)V

    .line 66
    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_1
    check-cast v3, La/ope;

    .line 72
    .line 73
    move-object v4, v2

    .line 74
    check-cast v4, La/mm40;

    .line 75
    .line 76
    move-object v5, p1

    .line 77
    check-cast v5, La/fet;

    .line 78
    .line 79
    check-cast p2, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    or-int/lit8 p1, v1, 0x1

    .line 85
    .line 86
    invoke-static {p1}, La/x8x;->L(I)I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    iget v0, p0, La/q0m;->b:I

    .line 91
    .line 92
    iget-wide v1, p0, La/q0m;->c:J

    .line 93
    .line 94
    invoke-static/range {v0 .. v6}, La/tdc;->v(IJLa/ope;La/mm40;La/fet;I)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

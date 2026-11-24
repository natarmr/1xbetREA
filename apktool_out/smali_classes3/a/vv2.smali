.class public final synthetic La/vv2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:La/ugd;

.field public final synthetic g:La/ugd;

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(La/mm40;JJLjava/lang/Object;La/ugd;La/ugd;IB)V
    .locals 0

    .line 1
    iput-byte p10, p0, La/vv2;->a:B

    iput-object p1, p0, La/vv2;->b:La/mm40;

    iput-wide p2, p0, La/vv2;->c:J

    iput-wide p4, p0, La/vv2;->d:J

    iput-object p6, p0, La/vv2;->e:Ljava/lang/Object;

    iput-object p7, p0, La/vv2;->f:La/ugd;

    iput-object p8, p0, La/vv2;->g:La/ugd;

    iput p9, p0, La/vv2;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/vv2;->a:B

    .line 2
    .line 3
    iget v1, p0, La/vv2;->h:I

    .line 4
    .line 5
    iget-object v2, p0, La/vv2;->e:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object v8, v2

    .line 11
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 12
    .line 13
    move-object v11, p1

    .line 14
    check-cast v11, La/fet;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    or-int/lit8 p1, v1, 0x1

    .line 22
    .line 23
    invoke-static {p1}, La/x8x;->L(I)I

    .line 24
    .line 25
    .line 26
    move-result v12

    .line 27
    iget-object v3, p0, La/vv2;->b:La/mm40;

    .line 28
    .line 29
    iget-wide v4, p0, La/vv2;->c:J

    .line 30
    .line 31
    iget-wide v6, p0, La/vv2;->d:J

    .line 32
    .line 33
    iget-object v9, p0, La/vv2;->f:La/ugd;

    .line 34
    .line 35
    iget-object v10, p0, La/vv2;->g:La/ugd;

    .line 36
    .line 37
    invoke-static/range {v3 .. v12}, La/r8x;->b(La/mm40;JJLkotlin/jvm/functions/Function0;La/ugd;La/ugd;La/fet;I)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_0
    move-object v5, v2

    .line 44
    check-cast v5, La/vhv0;

    .line 45
    .line 46
    move-object v8, p1

    .line 47
    check-cast v8, La/fet;

    .line 48
    .line 49
    check-cast p2, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    move-result v9

    .line 60
    iget-object v0, p0, La/vv2;->b:La/mm40;

    .line 61
    .line 62
    iget-wide v1, p0, La/vv2;->c:J

    .line 63
    .line 64
    iget-wide v3, p0, La/vv2;->d:J

    .line 65
    .line 66
    iget-object v6, p0, La/vv2;->f:La/ugd;

    .line 67
    .line 68
    iget-object v7, p0, La/vv2;->g:La/ugd;

    .line 69
    .line 70
    invoke-static/range {v0 .. v9}, La/j47;->H(La/mm40;JJLa/vhv0;La/ugd;La/ugd;La/fet;I)V

    .line 71
    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_1
    move-object v5, v2

    .line 77
    check-cast v5, La/vhv0;

    .line 78
    .line 79
    move-object v8, p1

    .line 80
    check-cast v8, La/fet;

    .line 81
    .line 82
    check-cast p2, Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    or-int/lit8 p1, v1, 0x1

    .line 88
    .line 89
    invoke-static {p1}, La/x8x;->L(I)I

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    iget-object v0, p0, La/vv2;->b:La/mm40;

    .line 94
    .line 95
    iget-wide v1, p0, La/vv2;->c:J

    .line 96
    .line 97
    iget-wide v3, p0, La/vv2;->d:J

    .line 98
    .line 99
    iget-object v6, p0, La/vv2;->f:La/ugd;

    .line 100
    .line 101
    iget-object v7, p0, La/vv2;->g:La/ugd;

    .line 102
    .line 103
    invoke-static/range {v0 .. v9}, La/kc5;->J(La/mm40;JJLa/vhv0;La/ugd;La/ugd;La/fet;I)V

    .line 104
    .line 105
    .line 106
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

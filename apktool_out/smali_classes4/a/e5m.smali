.class public final synthetic La/e5m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:J

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(BIJLa/mm40;Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/e5m;->a:B

    iput-object p5, p0, La/e5m;->b:La/mm40;

    iput-object p6, p0, La/e5m;->c:Ljava/lang/String;

    iput-wide p3, p0, La/e5m;->d:J

    iput p2, p0, La/e5m;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;ILjava/lang/String;JI)V
    .locals 0

    .line 1
    const/4 p6, 0x3

    iput-byte p6, p0, La/e5m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/e5m;->b:La/mm40;

    iput p2, p0, La/e5m;->e:I

    iput-object p3, p0, La/e5m;->c:Ljava/lang/String;

    iput-wide p4, p0, La/e5m;->d:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/e5m;->a:B

    .line 2
    .line 3
    iget v1, p0, La/e5m;->e:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    move-object v7, p1

    .line 10
    check-cast v7, La/fet;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, La/x8x;->L(I)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    iget v3, p0, La/e5m;->e:I

    .line 22
    .line 23
    iget-wide v5, p0, La/e5m;->d:J

    .line 24
    .line 25
    iget-object v8, p0, La/e5m;->b:La/mm40;

    .line 26
    .line 27
    iget-object v9, p0, La/e5m;->c:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static/range {v3 .. v9}, La/hfm0;->k(IIJLa/fet;La/mm40;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_0
    move-object v3, p1

    .line 36
    check-cast v3, La/fet;

    .line 37
    .line 38
    check-cast p2, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    or-int/lit8 p1, v1, 0x1

    .line 44
    .line 45
    invoke-static {p1}, La/x8x;->L(I)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget-wide v1, p0, La/e5m;->d:J

    .line 50
    .line 51
    iget-object v4, p0, La/e5m;->b:La/mm40;

    .line 52
    .line 53
    iget-object v5, p0, La/e5m;->c:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static/range {v0 .. v5}, La/cjx;->I(IJLa/fet;La/mm40;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_1
    move-object v3, p1

    .line 62
    check-cast v3, La/fet;

    .line 63
    .line 64
    check-cast p2, Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    or-int/lit8 p1, v1, 0x1

    .line 70
    .line 71
    invoke-static {p1}, La/x8x;->L(I)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    iget-wide v1, p0, La/e5m;->d:J

    .line 76
    .line 77
    iget-object v4, p0, La/e5m;->b:La/mm40;

    .line 78
    .line 79
    iget-object v5, p0, La/e5m;->c:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static/range {v0 .. v5}, La/hlm;->g(IJLa/fet;La/mm40;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_2
    move-object v3, p1

    .line 88
    check-cast v3, La/fet;

    .line 89
    .line 90
    check-cast p2, Ljava/lang/Integer;

    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    or-int/lit8 p1, v1, 0x1

    .line 96
    .line 97
    invoke-static {p1}, La/x8x;->L(I)I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    iget-wide v1, p0, La/e5m;->d:J

    .line 102
    .line 103
    iget-object v4, p0, La/e5m;->b:La/mm40;

    .line 104
    .line 105
    iget-object v5, p0, La/e5m;->c:Ljava/lang/String;

    .line 106
    .line 107
    invoke-static/range {v0 .. v5}, La/thb;->o(IJLa/fet;La/mm40;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object p0

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

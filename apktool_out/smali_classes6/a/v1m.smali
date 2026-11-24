.class public final synthetic La/v1m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:La/mm40;

.field public final synthetic d:J

.field public final synthetic e:I

.field public final synthetic f:B

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/l7m0;JLjava/lang/String;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/v1m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/v1m;->c:La/mm40;

    iput-object p2, p0, La/v1m;->g:Ljava/lang/Object;

    iput-wide p3, p0, La/v1m;->d:J

    iput-object p5, p0, La/v1m;->b:Ljava/lang/String;

    iput p6, p0, La/v1m;->e:I

    iput-byte p7, p0, La/v1m;->f:B

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;La/mm40;JIIB)V
    .locals 0

    .line 2
    iput-byte p8, p0, La/v1m;->a:B

    iput-object p1, p0, La/v1m;->g:Ljava/lang/Object;

    iput-object p2, p0, La/v1m;->b:Ljava/lang/String;

    iput-object p3, p0, La/v1m;->c:La/mm40;

    iput-wide p4, p0, La/v1m;->d:J

    iput p6, p0, La/v1m;->e:I

    iput-byte p7, p0, La/v1m;->f:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/v1m;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/v1m;->g:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, La/r2x;

    .line 10
    .line 11
    move-object v6, p1

    .line 12
    check-cast v6, La/fet;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget p1, p0, La/v1m;->e:I

    .line 20
    .line 21
    or-int/lit8 p1, p1, 0x1

    .line 22
    .line 23
    invoke-static {p1}, La/x8x;->L(I)I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    iget-object v2, p0, La/v1m;->b:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v3, p0, La/v1m;->c:La/mm40;

    .line 30
    .line 31
    iget-wide v4, p0, La/v1m;->d:J

    .line 32
    .line 33
    iget-byte v8, p0, La/v1m;->f:B

    .line 34
    .line 35
    invoke-static/range {v1 .. v8}, La/dww;->b(La/r2x;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    iget-object v0, p0, La/v1m;->g:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v1, v0

    .line 44
    check-cast v1, La/pm80;

    .line 45
    .line 46
    move-object v6, p1

    .line 47
    check-cast v6, La/fet;

    .line 48
    .line 49
    check-cast p2, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget p1, p0, La/v1m;->e:I

    .line 55
    .line 56
    or-int/lit8 p1, p1, 0x1

    .line 57
    .line 58
    invoke-static {p1}, La/x8x;->L(I)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    iget-object v2, p0, La/v1m;->b:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v3, p0, La/v1m;->c:La/mm40;

    .line 65
    .line 66
    iget-wide v4, p0, La/v1m;->d:J

    .line 67
    .line 68
    iget-byte v8, p0, La/v1m;->f:B

    .line 69
    .line 70
    invoke-static/range {v1 .. v8}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 71
    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_1
    iget-object v0, p0, La/v1m;->g:Ljava/lang/Object;

    .line 77
    .line 78
    move-object v2, v0

    .line 79
    check-cast v2, La/l7m0;

    .line 80
    .line 81
    move-object v6, p1

    .line 82
    check-cast v6, La/fet;

    .line 83
    .line 84
    check-cast p2, Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget p1, p0, La/v1m;->e:I

    .line 90
    .line 91
    or-int/lit8 p1, p1, 0x1

    .line 92
    .line 93
    invoke-static {p1}, La/x8x;->L(I)I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    iget-object v1, p0, La/v1m;->c:La/mm40;

    .line 98
    .line 99
    iget-wide v3, p0, La/v1m;->d:J

    .line 100
    .line 101
    iget-object v5, p0, La/v1m;->b:Ljava/lang/String;

    .line 102
    .line 103
    iget-byte v8, p0, La/v1m;->f:B

    .line 104
    .line 105
    invoke-static/range {v1 .. v8}, La/plc;->j(La/mm40;La/l7m0;JLjava/lang/String;La/fet;II)V

    .line 106
    .line 107
    .line 108
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    return-object p0

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

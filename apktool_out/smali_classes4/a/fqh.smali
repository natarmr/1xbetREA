.class public final synthetic La/fqh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:J

.field public final synthetic d:B

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IJLa/ow3;La/mm40;La/g8k0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/fqh;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p5, p0, La/fqh;->b:La/mm40;

    iput-object p6, p0, La/fqh;->e:Ljava/lang/Object;

    iput-object p4, p0, La/fqh;->f:Ljava/lang/Object;

    iput-wide p2, p0, La/fqh;->c:J

    iput-byte p1, p0, La/fqh;->d:B

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/a4x;La/y9q0;JII)V
    .locals 0

    .line 2
    const/4 p7, 0x0

    iput-byte p7, p0, La/fqh;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fqh;->b:La/mm40;

    iput-object p2, p0, La/fqh;->e:Ljava/lang/Object;

    iput-object p3, p0, La/fqh;->f:Ljava/lang/Object;

    iput-wide p4, p0, La/fqh;->c:J

    iput-byte p6, p0, La/fqh;->d:B

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;La/y9q0;JLa/mm40;I)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput-byte v0, p0, La/fqh;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fqh;->e:Ljava/lang/Object;

    iput-object p2, p0, La/fqh;->f:Ljava/lang/Object;

    iput-wide p3, p0, La/fqh;->c:J

    iput-object p5, p0, La/fqh;->b:La/mm40;

    iput-byte p6, p0, La/fqh;->d:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/fqh;->a:B

    .line 2
    .line 3
    iget-byte v1, p0, La/fqh;->d:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/fqh;->f:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, La/fqh;->e:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object v11, v4

    .line 14
    check-cast v11, Ljava/lang/String;

    .line 15
    .line 16
    move-object v10, v3

    .line 17
    check-cast v10, La/y9q0;

    .line 18
    .line 19
    move-object v8, p1

    .line 20
    check-cast v8, La/fet;

    .line 21
    .line 22
    check-cast p2, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    or-int/lit8 p1, v1, 0x1

    .line 28
    .line 29
    invoke-static {p1}, La/x8x;->L(I)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    iget-wide v6, p0, La/fqh;->c:J

    .line 34
    .line 35
    iget-object v9, p0, La/fqh;->b:La/mm40;

    .line 36
    .line 37
    invoke-static/range {v5 .. v11}, La/w7n0;->l(IJLa/fet;La/mm40;La/y9q0;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_0
    check-cast v4, La/g8k0;

    .line 44
    .line 45
    check-cast v3, La/ow3;

    .line 46
    .line 47
    move-object v5, p1

    .line 48
    check-cast v5, La/fet;

    .line 49
    .line 50
    check-cast p2, Ljava/lang/Integer;

    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    or-int/lit8 p1, v1, 0x1

    .line 56
    .line 57
    invoke-static {p1}, La/x8x;->L(I)I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    iget-object v0, p0, La/fqh;->b:La/mm40;

    .line 62
    .line 63
    move-object v2, v3

    .line 64
    move-object v1, v4

    .line 65
    iget-wide v3, p0, La/fqh;->c:J

    .line 66
    .line 67
    invoke-static/range {v0 .. v6}, La/qcc;->w(La/mm40;La/g8k0;La/ow3;JLa/fet;I)V

    .line 68
    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_1
    move-object v1, v4

    .line 74
    check-cast v1, La/a4x;

    .line 75
    .line 76
    check-cast v3, La/y9q0;

    .line 77
    .line 78
    move-object v6, p1

    .line 79
    check-cast v6, La/fet;

    .line 80
    .line 81
    check-cast p2, Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static {v2}, La/x8x;->L(I)I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    iget-object v0, p0, La/fqh;->b:La/mm40;

    .line 91
    .line 92
    move-object v2, v3

    .line 93
    iget-wide v3, p0, La/fqh;->c:J

    .line 94
    .line 95
    iget-byte v5, p0, La/fqh;->d:B

    .line 96
    .line 97
    invoke-static/range {v0 .. v7}, La/plc;->a(La/mm40;La/a4x;La/y9q0;JILa/fet;I)V

    .line 98
    .line 99
    .line 100
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

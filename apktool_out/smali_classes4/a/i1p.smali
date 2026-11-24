.class public final La/i1p;
.super La/k1p;
.source "SourceFile"


# instance fields
.field public final synthetic b:B

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(BJ)V
    .locals 0

    iput-byte p1, p0, La/i1p;->b:B

    packed-switch p1, :pswitch_data_0

    .line 42
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, La/i1p;-><init>(Ljava/io/Serializable;B)V

    return-void

    .line 43
    :pswitch_0
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-direct {p0, p1}, La/i1p;-><init>(Ljava/lang/Object;)V

    return-void

    .line 44
    :pswitch_1
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, La/i1p;-><init>(Ljava/io/Serializable;B)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(IB)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/i1p;->b:B

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 p2, 0x0

    .line 11
    invoke-direct {p0, p1, p2}, La/i1p;-><init>(Ljava/io/Serializable;B)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-direct {p0, p1}, La/i1p;-><init>(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 p2, 0x1

    .line 28
    invoke-direct {p0, p1, p2}, La/i1p;-><init>(Ljava/io/Serializable;B)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ljava/io/Serializable;B)V
    .locals 0

    iput-byte p2, p0, La/i1p;->b:B

    packed-switch p2, :pswitch_data_0

    .line 33
    sget-object p2, La/m1p;->e:La/m1p;

    .line 34
    invoke-direct {p0, p2}, La/k1p;-><init>(La/m1p;)V

    .line 35
    iput-object p1, p0, La/i1p;->c:Ljava/lang/Object;

    return-void

    .line 36
    :pswitch_0
    sget-object p2, La/m1p;->f:La/m1p;

    .line 37
    invoke-direct {p0, p2}, La/k1p;-><init>(La/m1p;)V

    .line 38
    iput-object p1, p0, La/i1p;->c:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/i1p;->b:B

    .line 39
    sget-object v0, La/m1p;->d:La/m1p;

    .line 40
    invoke-direct {p0, v0}, La/k1p;-><init>(La/m1p;)V

    .line 41
    iput-object p1, p0, La/i1p;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/i1p;->b:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/i1p;->c:Ljava/lang/Object;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, La/i1p;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/io/Serializable;

    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_1
    iget-object p0, p0, La/i1p;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/io/Serializable;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

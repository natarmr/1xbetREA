.class public final La/j1p;
.super La/k1p;
.source "SourceFile"


# instance fields
.field public final synthetic b:B

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/j1p;->b:B

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch p2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object p2, La/m1p;->a:La/m1p;

    .line 10
    .line 11
    invoke-direct {p0, p2}, La/k1p;-><init>(La/m1p;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, La/j1p;->c:Ljava/lang/String;

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    sget-object p2, La/m1p;->c:La/m1p;

    .line 18
    .line 19
    invoke-direct {p0, p2}, La/k1p;-><init>(La/m1p;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/j1p;->c:Ljava/lang/String;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_1
    sget-object p2, La/m1p;->b:La/m1p;

    .line 26
    .line 27
    invoke-direct {p0, p2}, La/k1p;-><init>(La/m1p;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/j1p;->c:Ljava/lang/String;

    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/j1p;->b:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/j1p;->c:Ljava/lang/String;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, La/j1p;->c:Ljava/lang/String;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    iget-object p0, p0, La/j1p;->c:Ljava/lang/String;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final La/xri;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/gle0;La/us00;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-byte p1, p0, La/xri;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, La/xri;

    .line 8
    .line 9
    invoke-direct {p1, p2}, La/xri;-><init>(La/us00;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/xri;->b:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(La/us00;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/xri;->a:B

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, La/xri;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()La/svu;
    .locals 2

    .line 1
    iget-byte v0, p0, La/xri;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/xri;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/xri;

    .line 9
    .line 10
    invoke-virtual {p0}, La/xri;->a()La/svu;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    new-instance v0, La/svu;

    .line 16
    .line 17
    new-instance v1, La/bb6;

    .line 18
    .line 19
    check-cast p0, La/us00;

    .line 20
    .line 21
    invoke-direct {v1, p0}, La/bb6;-><init>(La/us00;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1}, La/svu;-><init>(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

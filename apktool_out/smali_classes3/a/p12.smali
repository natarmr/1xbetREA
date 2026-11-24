.class public final La/p12;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/o12;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/p12;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p1, La/o12;->a:La/ii;

    .line 8
    .line 9
    iget-object p1, p1, La/o12;->b:La/r12;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v0, La/p12;

    .line 18
    .line 19
    invoke-direct {v0, p1}, La/p12;-><init>(La/r12;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/p12;->b:Ljava/lang/Object;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(La/r12;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/p12;->a:B

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, La/p12;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()La/r12;
    .locals 1

    .line 1
    iget-byte v0, p0, La/p12;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/p12;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/r12;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    check-cast p0, La/p12;

    .line 12
    .line 13
    iget-object p0, p0, La/p12;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/r12;

    .line 16
    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

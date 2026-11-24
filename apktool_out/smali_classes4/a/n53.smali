.class public final La/n53;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/n4d;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/t33;


# direct methods
.method public synthetic constructor <init>(La/t33;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/n53;->a:B

    iput-object p1, p0, La/n53;->b:La/t33;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-byte v0, p0, La/n53;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/n53;->b:La/t33;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/y3d;

    .line 13
    .line 14
    iget-wide v0, p0, La/y3d;->a:J

    .line 15
    .line 16
    return-wide v0

    .line 17
    :pswitch_0
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, La/y3d;

    .line 22
    .line 23
    iget-wide v0, p0, La/y3d;->a:J

    .line 24
    .line 25
    return-wide v0

    .line 26
    :pswitch_1
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, La/y3d;

    .line 31
    .line 32
    iget-wide v0, p0, La/y3d;->a:J

    .line 33
    .line 34
    return-wide v0

    .line 35
    :pswitch_2
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/y3d;

    .line 40
    .line 41
    iget-wide v0, p0, La/y3d;->a:J

    .line 42
    .line 43
    return-wide v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

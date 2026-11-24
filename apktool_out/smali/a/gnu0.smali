.class public final synthetic La/gnu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zy3;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ig00;


# direct methods
.method public synthetic constructor <init>(La/ig00;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gnu0;->a:B

    iput-object p1, p0, La/gnu0;->b:La/ig00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)La/ig00;
    .locals 1

    .line 1
    iget-byte v0, p0, La/gnu0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/gnu0;->b:La/ig00;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Void;

    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/by9;

    .line 15
    .line 16
    invoke-interface {p0}, La/by9;->b()La/ig00;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    check-cast p1, La/by9;

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/by9;

    .line 28
    .line 29
    invoke-interface {p0}, La/by9;->a()La/ig00;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

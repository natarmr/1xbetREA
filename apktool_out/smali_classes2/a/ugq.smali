.class public final La/ugq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/n5d0;


# instance fields
.field public final synthetic a:B

.field public final b:La/pmi;


# direct methods
.method public synthetic constructor <init>(La/pmi;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ugq;->a:B

    iput-object p1, p0, La/ugq;->b:La/pmi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ugq;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ugq;->b:La/pmi;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/pmi;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/p5d0;

    .line 11
    .line 12
    invoke-static {p0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    iget-object p0, p0, La/pmi;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, La/p5d0;

    .line 19
    .line 20
    invoke-static {p0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_1
    iget-object p0, p0, La/pmi;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, La/dgq;

    .line 27
    .line 28
    invoke-static {p0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_2
    iget-object p0, p0, La/pmi;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, La/nfq;

    .line 35
    .line 36
    invoke-static {p0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

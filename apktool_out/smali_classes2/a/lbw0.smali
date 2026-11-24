.class public final synthetic La/lbw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pnw0;


# direct methods
.method public synthetic constructor <init>(La/pnw0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lbw0;->a:B

    iput-object p1, p0, La/lbw0;->b:La/pnw0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/lbw0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/lbw0;->b:La/pnw0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/lzw0;

    .line 9
    .line 10
    iget-object p0, p0, La/pnw0;->d:La/okt0;

    .line 11
    .line 12
    invoke-direct {v0, p0}, La/lzw0;-><init>(La/okt0;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    new-instance v0, La/lzw0;

    .line 17
    .line 18
    iget-object p0, p0, La/pnw0;->c:La/mpt0;

    .line 19
    .line 20
    invoke-direct {v0, p0}, La/lzw0;-><init>(La/mpt0;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

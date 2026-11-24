.class public final synthetic La/whh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(BJ)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/whh;->a:B

    iput-wide p2, p0, La/whh;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/whh;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, La/jnv0;

    .line 7
    .line 8
    const/4 v7, 0x0

    .line 9
    sget-object v4, La/iun;->a:La/iun;

    .line 10
    .line 11
    iget-wide v2, p0, La/whh;->b:J

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    const/4 v6, 0x0

    .line 15
    invoke-direct/range {v1 .. v7}, La/jnv0;-><init>(JLjava/util/List;ZZZ)V

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :pswitch_0
    sget-object v0, La/wen;->b:La/uen;

    .line 20
    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    sget-object v2, La/bfn;->d:La/bfn;

    .line 26
    .line 27
    invoke-static {v0, v1, v2}, La/ibc;->w0(JLa/bfn;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    sget-object v2, La/bfn;->e:La/bfn;

    .line 32
    .line 33
    invoke-static {v0, v1, v2}, La/wen;->l(JLa/bfn;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    iget-wide v2, p0, La/whh;->b:J

    .line 38
    .line 39
    add-long/2addr v0, v2

    .line 40
    invoke-static {v0, v1}, Landroidx/compose/runtime/e;->c(J)La/egk0;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

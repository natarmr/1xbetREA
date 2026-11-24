.class public final La/wz3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/cvw0;ILjava/lang/Exception;[BLjava/util/Map;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/wz3;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/wz3;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput p2, p0, La/wz3;->b:I

    .line 10
    .line 11
    iput-object p3, p0, La/wz3;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, La/wz3;->e:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, La/wz3;->f:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(La/yz3;Ljava/util/List;Ljava/util/List;ILjava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/wz3;->a:B

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/wz3;->f:Ljava/lang/Object;

    iput-object p2, p0, La/wz3;->c:Ljava/lang/Object;

    iput-object p3, p0, La/wz3;->d:Ljava/lang/Object;

    iput p4, p0, La/wz3;->b:I

    iput-object p5, p0, La/wz3;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-byte v0, p0, La/wz3;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/wz3;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La/cvw0;

    .line 9
    .line 10
    iget-object v1, p0, La/wz3;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Exception;

    .line 13
    .line 14
    iget-object v2, p0, La/wz3;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, [B

    .line 17
    .line 18
    iget-object v0, v0, La/cvw0;->f:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, La/g1x0;

    .line 21
    .line 22
    iget p0, p0, La/wz3;->b:I

    .line 23
    .line 24
    invoke-interface {v0, p0, v1, v2}, La/g1x0;->a(ILjava/lang/Throwable;[B)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    new-instance v0, La/vz3;

    .line 29
    .line 30
    invoke-direct {v0, p0}, La/vz3;-><init>(La/wz3;)V

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-static {v0, v1}, La/cy2;->w(La/kpb;Z)La/amk;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v1, p0, La/wz3;->f:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, La/yz3;

    .line 41
    .line 42
    iget-object v1, v1, La/yz3;->c:La/xz3;

    .line 43
    .line 44
    new-instance v2, La/lfr;

    .line 45
    .line 46
    const/4 v3, 0x3

    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-direct {v2, p0, v0, v4, v3}, La/lfr;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZB)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v2}, La/xz3;->execute(Ljava/lang/Runnable;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

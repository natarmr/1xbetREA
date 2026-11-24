.class public final La/s3d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements La/khy;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/gh90;)V
    .locals 4

    const/4 v0, 0x1

    iput-byte v0, p0, La/s3d;->a:B

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    .line 38
    new-array v1, v0, [La/pqs0;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 39
    new-instance v3, La/sqs0;

    invoke-direct {v3, p0}, La/sqs0;-><init>(La/s3d;)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 40
    :cond_0
    new-instance v0, La/ih90;

    invoke-direct {v0, p1, v1}, La/ih90;-><init>(La/gh90;[La/pqs0;)V

    iput-object v0, p0, La/s3d;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/hh90;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/s3d;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const/16 v0, 0x8

    .line 8
    .line 9
    new-array v1, v0, [La/pqs0;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v0, :cond_0

    .line 13
    .line 14
    new-instance v3, La/tqs0;

    .line 15
    .line 16
    invoke-direct {v3, p0}, La/tqs0;-><init>(La/s3d;)V

    .line 17
    .line 18
    .line 19
    aput-object v3, v1, v2

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v0, La/jh90;

    .line 25
    .line 26
    invoke-direct {v0, p1, v1}, La/jh90;-><init>(La/hh90;[La/pqs0;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/s3d;->b:Ljava/lang/Object;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>(Ljava/util/Enumeration;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/s3d;->a:B

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, La/s3d;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/s3d;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, La/y2;

    invoke-direct {v0, p1}, La/y2;-><init>([Ljava/lang/Object;)V

    .line 34
    iput-object v0, p0, La/s3d;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget-byte v0, p0, La/s3d;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/s3d;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/y2;

    .line 9
    .line 10
    invoke-virtual {p0}, La/y2;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    check-cast p0, La/jh90;

    .line 16
    .line 17
    iget-boolean p0, p0, La/fh90;->c:Z

    .line 18
    .line 19
    return p0

    .line 20
    :pswitch_1
    check-cast p0, La/ih90;

    .line 21
    .line 22
    iget-boolean p0, p0, La/fh90;->c:Z

    .line 23
    .line 24
    return p0

    .line 25
    :pswitch_2
    check-cast p0, Ljava/util/Enumeration;

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/s3d;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/s3d;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/y2;

    .line 9
    .line 10
    invoke-virtual {p0}, La/y2;->next()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    check-cast p0, La/jh90;

    .line 16
    .line 17
    invoke-virtual {p0}, La/jh90;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/util/Map$Entry;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_1
    check-cast p0, La/ih90;

    .line 25
    .line 26
    invoke-virtual {p0}, La/ih90;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ljava/util/Map$Entry;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_2
    check-cast p0, Ljava/util/Enumeration;

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

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

.method public final remove()V
    .locals 1

    .line 1
    iget-byte v0, p0, La/s3d;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p0

    .line 12
    :pswitch_0
    iget-object p0, p0, La/s3d;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/jh90;

    .line 15
    .line 16
    invoke-virtual {p0}, La/jh90;->remove()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    iget-object p0, p0, La/s3d;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, La/ih90;

    .line 23
    .line 24
    invoke-virtual {p0}, La/ih90;->remove()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 29
    .line 30
    const-string v0, "Operation is not supported for read-only collection"

    .line 31
    .line 32
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

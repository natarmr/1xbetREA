.class public Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static instance:Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;

.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field private useDirect:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    new-instance v0, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->instance:Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->useDirect:Z

    .line 6
    .line 7
    return-void
.end method

.method public static getInstance()Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->instance:Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public allocate(I)Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    sget-object p0, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v0, 0x20

    .line 4
    .line 5
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    sget-object p0, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, "Allocating buffer "

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->logTrace(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public allocateDirect(I)Ljava/nio/ByteBuffer;
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "Allocating direct buffer "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logTrace(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->useDirect:Z

    .line 31
    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_1
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public setUseDirect(Z)V
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const-string v1, "enabled"

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string v1, "disabled"

    .line 19
    .line 20
    :goto_0
    const-string v2, "Direct buffers are "

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logTrace(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->useDirect:Z

    .line 30
    .line 31
    return-void
.end method

.class public final La/ftg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/a8z;
.implements Ljava/io/Serializable;


# static fields
.field public static final c:La/etg0;

.field public static final d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic e:J


# instance fields
.field public volatile a:Lkotlin/jvm/functions/Function0;

.field public volatile b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/etg0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, La/etg0;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/ftg0;->c:La/etg0;

    .line 8
    .line 9
    const-class v0, La/ftg0;

    .line 10
    .line 11
    const-class v1, Ljava/lang/Object;

    .line 12
    .line 13
    const-string v2, "b"

    .line 14
    .line 15
    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sput-object v1, La/ftg0;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 20
    .line 21
    sget-object v1, La;->a:Lsun/misc/Unsafe;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v1, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    sput-wide v0, La/ftg0;->e:J

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, La/ftg0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v5, La/m2t0;->a:La/m2t0;

    .line 4
    .line 5
    if-eq v0, v5, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, La/ftg0;->a:Lkotlin/jvm/functions/Function0;

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    sget-object v0, La/ftg0;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 17
    .line 18
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v1, La;->a:Lsun/misc/Unsafe;

    .line 22
    .line 23
    sget-wide v3, La/ftg0;->e:J

    .line 24
    .line 25
    move-object v2, p0

    .line 26
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    iput-object p0, v2, La/ftg0;->a:Lkotlin/jvm/functions/Function0;

    .line 34
    .line 35
    return-object v6

    .line 36
    :cond_1
    sget-object p0, La;->a:Lsun/misc/Unsafe;

    .line 37
    .line 38
    sget-wide v3, La/ftg0;->e:J

    .line 39
    .line 40
    invoke-virtual {p0, v2, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-eq p0, v5, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move-object p0, v2

    .line 48
    goto :goto_0

    .line 49
    :cond_3
    move-object v2, p0

    .line 50
    :goto_1
    iget-object p0, v2, La/ftg0;->b:Ljava/lang/Object;

    .line 51
    .line 52
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, La/ftg0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, La/m2t0;->a:La/m2t0;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, La/ftg0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    const-string p0, "Lazy value not initialized yet."

    .line 22
    .line 23
    return-object p0
.end method

.class public final La/gix0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:La/gix0;

.field public static final c:La/gix0;

.field public static final d:La/gix0;

.field public static final e:La/gix0;

.field public static final f:La/gix0;


# instance fields
.field public final a:La/jix0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/gix0;

    .line 2
    .line 3
    new-instance v1, La/uxs0;

    .line 4
    .line 5
    const/16 v2, 0x15

    .line 6
    .line 7
    invoke-direct {v1, v2}, La/uxs0;-><init>(B)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, La/gix0;-><init>(La/lix0;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, La/gix0;->b:La/gix0;

    .line 14
    .line 15
    new-instance v0, La/gix0;

    .line 16
    .line 17
    new-instance v1, La/svs0;

    .line 18
    .line 19
    const/16 v2, 0x16

    .line 20
    .line 21
    invoke-direct {v1, v2}, La/svs0;-><init>(B)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1}, La/gix0;-><init>(La/lix0;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/gix0;->c:La/gix0;

    .line 28
    .line 29
    new-instance v0, La/gix0;

    .line 30
    .line 31
    new-instance v1, La/sxs0;

    .line 32
    .line 33
    invoke-direct {v1, v2}, La/sxs0;-><init>(B)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v1}, La/gix0;-><init>(La/lix0;)V

    .line 37
    .line 38
    .line 39
    new-instance v0, La/gix0;

    .line 40
    .line 41
    new-instance v1, La/bzs0;

    .line 42
    .line 43
    const/16 v2, 0x15

    .line 44
    .line 45
    invoke-direct {v1, v2}, La/bzs0;-><init>(B)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1}, La/gix0;-><init>(La/lix0;)V

    .line 49
    .line 50
    .line 51
    new-instance v0, La/gix0;

    .line 52
    .line 53
    new-instance v1, La/s6x0;

    .line 54
    .line 55
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v1}, La/gix0;-><init>(La/lix0;)V

    .line 59
    .line 60
    .line 61
    sput-object v0, La/gix0;->d:La/gix0;

    .line 62
    .line 63
    new-instance v0, La/gix0;

    .line 64
    .line 65
    new-instance v1, La/wxs0;

    .line 66
    .line 67
    invoke-direct {v1, v2}, La/wxs0;-><init>(B)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v0, v1}, La/gix0;-><init>(La/lix0;)V

    .line 71
    .line 72
    .line 73
    sput-object v0, La/gix0;->e:La/gix0;

    .line 74
    .line 75
    new-instance v0, La/gix0;

    .line 76
    .line 77
    new-instance v1, La/kys0;

    .line 78
    .line 79
    invoke-direct {v1, v2}, La/kys0;-><init>(B)V

    .line 80
    .line 81
    .line 82
    invoke-direct {v0, v1}, La/gix0;-><init>(La/lix0;)V

    .line 83
    .line 84
    .line 85
    sput-object v0, La/gix0;->f:La/gix0;

    .line 86
    .line 87
    return-void
.end method

.method public constructor <init>(La/lix0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, La/pyw0;->a()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, La/nmt0;

    .line 11
    .line 12
    invoke-direct {v0, p1}, La/nmt0;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/gix0;->a:La/jix0;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string v0, "java.vendor"

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "The Android Project"

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    new-instance v0, La/ilp0;

    .line 33
    .line 34
    invoke-direct {v0, p1}, La/ilp0;-><init>(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, La/gix0;->a:La/jix0;

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    new-instance v0, La/rkt0;

    .line 41
    .line 42
    const/16 v1, 0xf

    .line 43
    .line 44
    invoke-direct {v0, p1, v1}, La/rkt0;-><init>(Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, La/gix0;->a:La/jix0;

    .line 48
    .line 49
    return-void
.end method

.class public final La/lyn;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:La/lyn;

.field public static final c:La/lyn;


# instance fields
.field public final a:La/kyn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/lyn;

    .line 2
    .line 3
    new-instance v1, La/xak;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    invoke-direct {v1, v2}, La/xak;-><init>(B)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, La/lyn;-><init>(La/tyn;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, La/lyn;->b:La/lyn;

    .line 14
    .line 15
    new-instance v0, La/lyn;

    .line 16
    .line 17
    new-instance v1, La/pek;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1}, La/lyn;-><init>(La/tyn;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/lyn;->c:La/lyn;

    .line 26
    .line 27
    new-instance v0, La/lyn;

    .line 28
    .line 29
    new-instance v1, La/xak;

    .line 30
    .line 31
    const/16 v2, 0x9

    .line 32
    .line 33
    invoke-direct {v1, v2}, La/xak;-><init>(B)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v1}, La/lyn;-><init>(La/tyn;)V

    .line 37
    .line 38
    .line 39
    new-instance v0, La/lyn;

    .line 40
    .line 41
    new-instance v1, La/sek;

    .line 42
    .line 43
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, v1}, La/lyn;-><init>(La/tyn;)V

    .line 47
    .line 48
    .line 49
    new-instance v0, La/lyn;

    .line 50
    .line 51
    new-instance v1, La/ddk;

    .line 52
    .line 53
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-direct {v0, v1}, La/lyn;-><init>(La/tyn;)V

    .line 57
    .line 58
    .line 59
    new-instance v0, La/lyn;

    .line 60
    .line 61
    new-instance v1, La/nek;

    .line 62
    .line 63
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-direct {v0, v1}, La/lyn;-><init>(La/tyn;)V

    .line 67
    .line 68
    .line 69
    new-instance v0, La/lyn;

    .line 70
    .line 71
    new-instance v1, La/bek;

    .line 72
    .line 73
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-direct {v0, v1}, La/lyn;-><init>(La/tyn;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public constructor <init>(La/tyn;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, La/foq0;->a()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, La/lrc;

    .line 11
    .line 12
    const/16 v1, 0x1d

    .line 13
    .line 14
    invoke-direct {v0, p1, v1}, La/lrc;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/lyn;->a:La/kyn;

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string v0, "java.vendor"

    .line 21
    .line 22
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "The Android Project"

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    new-instance v0, La/lsn;

    .line 35
    .line 36
    invoke-direct {v0, p1}, La/lsn;-><init>(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, La/lyn;->a:La/kyn;

    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    new-instance v0, La/ocl;

    .line 43
    .line 44
    invoke-direct {v0, p1}, La/ocl;-><init>(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, La/lyn;->a:La/kyn;

    .line 48
    .line 49
    return-void
.end method

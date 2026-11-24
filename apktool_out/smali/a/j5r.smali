.class public final La/j5r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:La/j5r;


# instance fields
.field public final a:Ljava/util/Set;

.field public final b:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/j5r;

    .line 2
    .line 3
    sget-object v1, La/xun;->a:La/xun;

    .line 4
    .line 5
    sget-object v2, La/lun;->a:La/lun;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, La/j5r;-><init>(La/xun;La/lun;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, La/j5r;->c:La/j5r;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(La/xun;La/lun;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/j5r;->a:Ljava/util/Set;

    .line 8
    .line 9
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    sget-object p2, La/xun;->a:La/xun;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget-object p2, La/hun;->a:La/hun;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, La/j5r;->b:Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    return-void
.end method

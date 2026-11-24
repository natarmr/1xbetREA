.class public abstract La/p1x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/kuo;

.field public static final b:La/kuo;

.field public static final c:La/kuo;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/kuo;

    .line 2
    .line 3
    const-string v1, "GET"

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/kuo;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/p1x;->a:La/kuo;

    .line 9
    .line 10
    new-instance v0, La/kuo;

    .line 11
    .line 12
    sget-object v1, La/al50;->b:La/al50;

    .line 13
    .line 14
    invoke-direct {v0, v1}, La/kuo;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, La/p1x;->b:La/kuo;

    .line 18
    .line 19
    new-instance v0, La/kuo;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, v1}, La/kuo;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/p1x;->c:La/kuo;

    .line 26
    .line 27
    return-void
.end method

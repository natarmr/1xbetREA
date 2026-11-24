.class public abstract La/yub;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements La/khy;


# static fields
.field public static final c:La/xub;


# instance fields
.field public final a:C

.field public final b:C


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/xub;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, La/xub;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/yub;->c:La/xub;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(CC)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-char p1, p0, La/yub;->a:C

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-static {p1, p2, v0}, La/g8x;->J(III)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    int-to-char p1, p1

    .line 12
    iput-char p1, p0, La/yub;->b:C

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, La/zub;

    .line 2
    .line 3
    iget-char v1, p0, La/yub;->a:C

    .line 4
    .line 5
    iget-char p0, p0, La/yub;->b:C

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, La/zub;-><init>(CC)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

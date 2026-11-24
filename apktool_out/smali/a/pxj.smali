.class public final La/pxj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/u73;


# static fields
.field public static final a:La/pxj;

.field public static final b:La/mlq;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/pxj;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/pxj;->a:La/pxj;

    .line 7
    .line 8
    new-instance v0, La/mlq;

    .line 9
    .line 10
    const/high16 v1, 0x3f800000    # 1.0f

    .line 11
    .line 12
    const v2, 0x44bb8000    # 1500.0f

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, La/mlq;-><init>(FF)V

    .line 16
    .line 17
    .line 18
    sput-object v0, La/pxj;->b:La/mlq;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final get(I)La/xkq;
    .locals 0

    .line 1
    sget-object p0, La/pxj;->b:La/mlq;

    .line 2
    .line 3
    return-object p0
.end method

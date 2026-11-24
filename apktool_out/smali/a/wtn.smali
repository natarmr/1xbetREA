.class public final La/wtn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/y99;


# static fields
.field public static final a:La/wtn;

.field public static final b:La/k6z;

.field public static final c:La/z6k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/wtn;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/wtn;->a:La/wtn;

    .line 7
    .line 8
    sget-object v0, La/k6z;->a:La/k6z;

    .line 9
    .line 10
    sput-object v0, La/wtn;->b:La/k6z;

    .line 11
    .line 12
    new-instance v0, La/z6k;

    .line 13
    .line 14
    const/high16 v1, 0x3f800000    # 1.0f

    .line 15
    .line 16
    invoke-direct {v0, v1, v1}, La/z6k;-><init>(FF)V

    .line 17
    .line 18
    .line 19
    sput-object v0, La/wtn;->c:La/z6k;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final d()J
    .locals 2

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide v0
.end method

.method public final getDensity()La/w6k;
    .locals 0

    .line 1
    sget-object p0, La/wtn;->c:La/z6k;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLayoutDirection()La/k6z;
    .locals 0

    .line 1
    sget-object p0, La/wtn;->b:La/k6z;

    .line 2
    .line 3
    return-object p0
.end method

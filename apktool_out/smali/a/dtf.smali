.class public final La/dtf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:La/sf9;

.field public static final c:La/dtf;


# instance fields
.field public final a:La/rcf0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, La/s950;->b:La/s950;

    .line 2
    .line 3
    new-instance v1, La/sd9;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    invoke-direct {v1, v2}, La/sd9;-><init>(B)V

    .line 7
    .line 8
    .line 9
    new-instance v2, La/sf9;

    .line 10
    .line 11
    invoke-direct {v2, v1, v0}, La/sf9;-><init>(La/tdr;La/ia80;)V

    .line 12
    .line 13
    .line 14
    sput-object v2, La/dtf;->b:La/sf9;

    .line 15
    .line 16
    new-instance v0, La/dtf;

    .line 17
    .line 18
    sget-object v1, La/b4x;->b:La/v3x;

    .line 19
    .line 20
    sget-object v1, La/rcf0;->e:La/rcf0;

    .line 21
    .line 22
    invoke-direct {v0, v1}, La/dtf;-><init>(Ljava/util/List;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/dtf;->c:La/dtf;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-static {v0}, La/vtt0;->H(I)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-static {v0}, La/vtt0;->H(I)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/dtf;->b:La/sf9;

    .line 5
    .line 6
    invoke-static {v0, p1}, La/b4x;->F(Ljava/util/Comparator;Ljava/util/List;)La/rcf0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, La/dtf;->a:La/rcf0;

    .line 11
    .line 12
    return-void
.end method

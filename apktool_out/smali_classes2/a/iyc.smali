.class public final La/iyc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:La/iyc;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/iyc;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1, v1}, La/iyc;-><init>(IIZ)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/iyc;->d:La/iyc;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(IIZ)V
    .locals 0

    .line 1
    iput-boolean p3, p0, La/iyc;->c:Z

    iput p1, p0, La/iyc;->a:I

    iput p2, p0, La/iyc;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)La/iyc;
    .locals 3

    .line 1
    new-instance v0, La/iyc;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, p0, v1, v2}, La/iyc;-><init>(IIZ)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

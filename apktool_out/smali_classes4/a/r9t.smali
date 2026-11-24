.class public final La/r9t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/q9t;


# instance fields
.field public final a:J

.field public final b:Ljava/lang/Double;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/q9t;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/r9t;->Companion:La/q9t;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(IJLjava/lang/Double;)V
    .locals 3

    .line 1
    and-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v2, v0, :cond_1

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p2, p0, La/r9t;->a:J

    .line 11
    .line 12
    and-int/lit8 p1, p1, 0x2

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    iput-object v1, p0, La/r9t;->b:Ljava/lang/Double;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iput-object p4, p0, La/r9t;->b:Ljava/lang/Double;

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    sget-object p0, La/p9t;->a:La/p9t;

    .line 23
    .line 24
    invoke-virtual {p0}, La/p9t;->getDescriptor()La/ugi0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p1, v2, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 29
    .line 30
    .line 31
    throw v1
.end method

.method public constructor <init>(JLjava/lang/Double;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-wide p1, p0, La/r9t;->a:J

    .line 34
    iput-object p3, p0, La/r9t;->b:Ljava/lang/Double;

    return-void
.end method

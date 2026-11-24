.class public final La/gg6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/fg6;


# instance fields
.field public final a:J

.field public final b:I

.field public final c:I

.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/fg6;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/gg6;->Companion:La/fg6;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(IIIJ)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-wide p4, p0, La/gg6;->a:J

    .line 32
    iput p1, p0, La/gg6;->b:I

    .line 33
    iput p2, p0, La/gg6;->c:I

    .line 34
    iput p3, p0, La/gg6;->d:I

    return-void
.end method

.method public synthetic constructor <init>(IJIII)V
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0xf

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p2, p0, La/gg6;->a:J

    .line 11
    .line 12
    iput p4, p0, La/gg6;->b:I

    .line 13
    .line 14
    iput p5, p0, La/gg6;->c:I

    .line 15
    .line 16
    iput p6, p0, La/gg6;->d:I

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    sget-object p0, La/eg6;->a:La/eg6;

    .line 20
    .line 21
    invoke-virtual {p0}, La/eg6;->getDescriptor()La/ugi0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p1, v1, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    throw p0
.end method

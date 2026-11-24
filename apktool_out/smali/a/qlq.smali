.class public final La/qlq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/chi0;


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/plq;


# instance fields
.field public final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/plq;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/qlq;->Companion:La/plq;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(F)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/qlq;->a:F

    return-void
.end method

.method public synthetic constructor <init>(FI)V
    .locals 2

    .line 1
    and-int/lit8 v0, p2, 0x1

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v1, v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput p1, p0, La/qlq;->a:F

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sget-object p0, La/olq;->a:La/olq;

    .line 13
    .line 14
    invoke-virtual {p0}, La/olq;->getDescriptor()La/ugi0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p2, v1, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/qlq;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/qlq;

    .line 12
    .line 13
    iget p0, p0, La/qlq;->a:F

    .line 14
    .line 15
    iget p1, p1, La/qlq;->a:F

    .line 16
    .line 17
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget p0, p0, La/qlq;->a:F

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "FloatValue(value="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget p0, p0, La/qlq;->a:F

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.class public final La/urj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# static fields
.field public static final a:La/urj0;

.field public static final b:La/ewb0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/urj0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/urj0;->a:La/urj0;

    .line 7
    .line 8
    new-instance v0, La/ewb0;

    .line 9
    .line 10
    const-string v1, "kotlin.Short"

    .line 11
    .line 12
    sget-object v2, La/zvb0;->i:La/zvb0;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, La/ewb0;-><init>(Ljava/lang/String;La/zvb0;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, La/urj0;->b:La/ewb0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1}, La/rkj;->p()S

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/urj0;->b:La/ewb0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Number;->shortValue()S

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-interface {p1, p0}, La/bwn;->r(S)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

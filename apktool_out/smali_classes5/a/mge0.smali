.class public final La/mge0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yjj0;


# instance fields
.field public final synthetic a:B

.field public final b:F


# direct methods
.method public synthetic constructor <init>(FB)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mge0;->a:B

    iput p1, p0, La/mge0;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(JLa/k6z;La/w6k;)La/x1x;
    .locals 7

    .line 1
    iget-byte v0, p0, La/mge0;->a:B

    .line 2
    .line 3
    const-wide v1, 0xffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/16 v3, 0x20

    .line 9
    .line 10
    iget p0, p0, La/mge0;->b:F

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    new-instance p3, La/oe80;

    .line 23
    .line 24
    new-instance p4, La/jge0;

    .line 25
    .line 26
    cmpg-float v0, p0, v4

    .line 27
    .line 28
    if-gez v0, :cond_0

    .line 29
    .line 30
    move p0, v4

    .line 31
    :cond_0
    shr-long v5, p1, v3

    .line 32
    .line 33
    long-to-int v0, v5

    .line 34
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    and-long/2addr p1, v1

    .line 39
    long-to-int p1, p1

    .line 40
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-direct {p4, v4, p0, v0, p1}, La/jge0;-><init>(FFFF)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p3, p4}, La/oe80;-><init>(La/jge0;)V

    .line 48
    .line 49
    .line 50
    return-object p3

    .line 51
    :pswitch_0
    new-instance p3, La/oe80;

    .line 52
    .line 53
    new-instance p4, La/jge0;

    .line 54
    .line 55
    cmpg-float v0, p0, v4

    .line 56
    .line 57
    if-gez v0, :cond_1

    .line 58
    .line 59
    move p0, v4

    .line 60
    :cond_1
    shr-long v5, p1, v3

    .line 61
    .line 62
    long-to-int v0, v5

    .line 63
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    and-long/2addr p1, v1

    .line 68
    long-to-int p1, p1

    .line 69
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-direct {p4, v4, p0, v0, p1}, La/jge0;-><init>(FFFF)V

    .line 74
    .line 75
    .line 76
    invoke-direct {p3, p4}, La/oe80;-><init>(La/jge0;)V

    .line 77
    .line 78
    .line 79
    return-object p3

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

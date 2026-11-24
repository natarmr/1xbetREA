.class public final La/o4w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field public final synthetic a:La/rkt0;

.field public final synthetic b:La/n5a;

.field public final synthetic c:Landroid/hardware/Sensor;


# direct methods
.method public constructor <init>(La/rkt0;La/n5a;Landroid/hardware/Sensor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/o4w0;->a:La/rkt0;

    .line 5
    .line 6
    iput-object p2, p0, La/o4w0;->b:La/n5a;

    .line 7
    .line 8
    iput-object p3, p0, La/o4w0;->c:Landroid/hardware/Sensor;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/o4w0;->a:La/rkt0;

    .line 5
    .line 6
    iget-object v0, v0, La/rkt0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/hardware/SensorManager;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La/u8w0;

    .line 14
    .line 15
    iget-object v0, p0, La/o4w0;->c:Landroid/hardware/Sensor;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/hardware/Sensor;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/hardware/Sensor;->getVendor()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/hardware/Sensor;->getVersion()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-virtual {v0}, Landroid/hardware/Sensor;->getPower()F

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-virtual {v0}, Landroid/hardware/Sensor;->getMaximumRange()F

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    invoke-virtual {v0}, Landroid/hardware/Sensor;->getResolution()F

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    array-length v0, p1

    .line 53
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    invoke-direct/range {v1 .. v8}, La/u8w0;-><init>(Ljava/lang/String;Ljava/lang/String;IFFF[F)V

    .line 58
    .line 59
    .line 60
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 61
    .line 62
    iget-object p0, p0, La/o4w0;->b:La/n5a;

    .line 63
    .line 64
    invoke-virtual {p0, v1}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

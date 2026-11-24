.class public final La/ocy;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/srn;

.field public b:Z


# direct methods
.method public constructor <init>(La/ugi0;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/srn;

    .line 8
    .line 9
    new-instance v1, La/ens;

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    const/16 v8, 0x12

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    const-class v4, La/ocy;

    .line 16
    .line 17
    const-string v5, "readIfAbsent"

    .line 18
    .line 19
    const-string v6, "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z"

    .line 20
    .line 21
    move-object v3, p0

    .line 22
    invoke-direct/range {v1 .. v8}, La/ens;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p1, v1}, La/srn;-><init>(La/ugi0;La/ens;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, v3, La/ocy;->a:La/srn;

    .line 29
    .line 30
    return-void
.end method

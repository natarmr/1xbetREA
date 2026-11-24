.class public final La/p1g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/tkz;

.field public final b:La/sza;


# direct methods
.method public constructor <init>(La/tkz;La/gii0;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/p1g;->a:La/tkz;

    .line 8
    .line 9
    new-instance p1, La/sza;

    .line 10
    .line 11
    const/16 v0, 0x14

    .line 12
    .line 13
    invoke-direct {p1, p2, v0}, La/sza;-><init>(La/gii0;B)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/p1g;->b:La/sza;

    .line 17
    .line 18
    return-void
.end method
